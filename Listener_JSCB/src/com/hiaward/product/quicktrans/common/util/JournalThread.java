package com.hiaward.product.quicktrans.common.util;

import java.io.*;
import java.util.*;

/**
 * <p>�������ļ���ˮ�����߳���</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Hiaward</p>
 * @author zhujian
 * @version 1.0 zhujian 2007/1/4
 */
public class JournalThread extends Thread
{
  /**
   * <p>�������ļ���ˮ������</p>
   */
  protected class JournalObject
  {
    public String strBranchNum;
    public String strJournal;
    public int iLevel;
  }

  // ��󻺴�Ķ�����
  protected static int MAX_JOURNALOBJ_NUM = 1024;
  // ��ˮ�ļ���(1-3)��1Ϊֻ������Ҫ�ģ�2��֮��3���
  public static int LEVEL_NONE = 0;
  public static int LEVEL_1 = 1;
  public static int LEVEL_2 = 2;
  public static int LEVEL_3 = 3;

  // ��ǰ�ļ�������
  protected static int iCurLevel = LEVEL_3;

  // ��������ˮ�ļ���Ŀ¼
  public static String XBANKBASS_TRACEPATH = "/home/kuaich/Trace";
  // ѹ����ķ�������ˮ�ļ���Ŀ¼
  public static String XBANKBASS_ZIPTRACEPATH = "/home/kuaich/Trace/TraceZip/";
  // ���ݿ⵼�����ļ�Ŀ¼
  public static String XBANKBASS_DBEXPORTPATH = "/home/kuaich/Db/DbExport/";
  // ѹ��������ݿ⵼�����ļ�Ŀ¼
  public static String XBANKBASS_ZIPDBEXPORTPATH = "/home/kuaich/Db/DbExport/";

  // �������
  protected ArrayList arrJournalBuf = new ArrayList(MAX_JOURNALOBJ_NUM);

  // ��̬ʵ��
  protected static JournalThread instance = null;

  /**
   * <p>��ȡ����ʵ��</p>
   * @return LinxViewProxyThread ����ʵ��
   */
  public static JournalThread getInstance()
  {
    synchronized(XBANKBASS_TRACEPATH)
    {
      if (instance == null)
      {
        instance = new JournalThread();
        try{instance.start();}catch (Exception e){}
      }
    }
    return instance;
  }

  public void append(String strBranchNum, Exception e)
  {
    // ��¼��־��ˮ
    StringWriter sw = new StringWriter(1024 * 4);
    sw.write("[" + new com.hiaward.product.quicktrans.common.util.DateEx().getTimeStrFull() + "]");
    e.printStackTrace(new PrintWriter(sw));
    append(strBranchNum, JournalThread.LEVEL_1, sw.toString()+"\r\n");
  }

  public void append(String strBranchNum, Exception e, XmlParam xml)
  {
    // ��¼��־��ˮ
    StringWriter sw = new StringWriter(1024 * 4);
    sw.write("[" + new com.hiaward.product.quicktrans.common.util.DateEx().getTimeStrFull() + "]");
    e.printStackTrace(new PrintWriter(sw));
    append(strBranchNum, JournalThread.LEVEL_1, sw.toString() + "\r\n" + xml.toString() + "\r\n");
  }
  
  /**
   * <p>�����ˮ</p>
   * @param strBranchNum String ���к�
   * @param level int ��ˮ����
   * @param strJournal String ��ˮ����
   */
  public void append(String strBranchNum, int level, String strJournal)
  {
    if (strJournal == null || strJournal.length() == 0)
      return;

    if (strBranchNum == null || strBranchNum.trim().length() == 0)
        strBranchNum = "0000";

    JournalObject jobj = new JournalObject();
    jobj.strBranchNum = strBranchNum;
    jobj.iLevel = level;
    jobj.strJournal = strJournal;

    synchronized(XBANKBASS_TRACEPATH)
    {
      if (arrJournalBuf.size() >= MAX_JOURNALOBJ_NUM)
        arrJournalBuf.remove(0);
      arrJournalBuf.add(jobj);
    }
  }

   /**
    * <p>���ػ����run()����������ʵ�ʵ��̴߳������</p>
    */
   public void run()
   {
     while(true)
     {
       try{super.sleep(1000);} catch (Exception e){e.printStackTrace();}
       Object[] arrJObj = null;
       synchronized(XBANKBASS_TRACEPATH)
       {
         arrJObj = arrJournalBuf.toArray();
         arrJournalBuf.clear();
       }
       if (arrJObj == null || arrJObj.length <= 0)
         continue;
       for (int i=0; i<arrJObj.length; i++)
       {
         JournalObject jobj = (JournalObject)arrJObj[i];
         processJournal(jobj.strBranchNum, jobj.iLevel, jobj.strJournal);
       }
     }
   }

   /**
    * <p>������ˮ����</p>
    * @param strBranchNum String ���к�
    * @param level int ��ˮ����
    * @param strJournal String ��ˮ����
    * @return boolean �Ƿ�ɹ�
    */
   protected boolean processJournal(String strBranchNum, int level, String strJournal)
   {
     if (level > JournalThread.LEVEL_NONE && level <= iCurLevel)
     {
       String strDirPath = XBANKBASS_TRACEPATH + strBranchNum;
       String strJournalFilePath = strDirPath + '/' + new DateEx().getDateStrSimple() + ".log";
       try
       {
         File dir = new File(strDirPath);
         if (dir.isDirectory() || dir.mkdir())
         {
           FileWriter fw = new FileWriter(strJournalFilePath, true);
           fw.write(strJournal);
           fw.close();
           return true;
         }
       }
       catch (Exception e)
       {
       }
     }
     return false;
   }
}
