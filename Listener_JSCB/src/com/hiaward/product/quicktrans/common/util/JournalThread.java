package com.hiaward.product.quicktrans.common.util;

import java.io.*;
import java.util.*;

/**
 * <p>服务器文件流水处理线程类</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: Hiaward</p>
 * @author zhujian
 * @version 1.0 zhujian 2007/1/4
 */
public class JournalThread extends Thread
{
  /**
   * <p>服务器文件流水对象类</p>
   */
  protected class JournalObject
  {
    public String strBranchNum;
    public String strJournal;
    public int iLevel;
  }

  // 最大缓存的对象数
  protected static int MAX_JOURNALOBJ_NUM = 1024;
  // 流水的级别(1-3)，1为只记最重要的，2次之，3最后
  public static int LEVEL_NONE = 0;
  public static int LEVEL_1 = 1;
  public static int LEVEL_2 = 2;
  public static int LEVEL_3 = 3;

  // 当前的级别设置
  protected static int iCurLevel = LEVEL_3;

  // 服务器流水文件的目录
  public static String XBANKBASS_TRACEPATH = "/home/kuaich/Trace";
  // 压缩后的服务器流水文件的目录
  public static String XBANKBASS_ZIPTRACEPATH = "/home/kuaich/Trace/TraceZip/";
  // 数据库导出的文件目录
  public static String XBANKBASS_DBEXPORTPATH = "/home/kuaich/Db/DbExport/";
  // 压缩后的数据库导出的文件目录
  public static String XBANKBASS_ZIPDBEXPORTPATH = "/home/kuaich/Db/DbExport/";

  // 缓存对象
  protected ArrayList arrJournalBuf = new ArrayList(MAX_JOURNALOBJ_NUM);

  // 静态实例
  protected static JournalThread instance = null;

  /**
   * <p>获取对象实例</p>
   * @return LinxViewProxyThread 对象实例
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
    // 记录日志流水
    StringWriter sw = new StringWriter(1024 * 4);
    sw.write("[" + new com.hiaward.product.quicktrans.common.util.DateEx().getTimeStrFull() + "]");
    e.printStackTrace(new PrintWriter(sw));
    append(strBranchNum, JournalThread.LEVEL_1, sw.toString()+"\r\n");
  }

  public void append(String strBranchNum, Exception e, XmlParam xml)
  {
    // 记录日志流水
    StringWriter sw = new StringWriter(1024 * 4);
    sw.write("[" + new com.hiaward.product.quicktrans.common.util.DateEx().getTimeStrFull() + "]");
    e.printStackTrace(new PrintWriter(sw));
    append(strBranchNum, JournalThread.LEVEL_1, sw.toString() + "\r\n" + xml.toString() + "\r\n");
  }
  
  /**
   * <p>添加流水</p>
   * @param strBranchNum String 分行号
   * @param level int 流水级别
   * @param strJournal String 流水内容
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
    * <p>重载基类的run()函数，运行实际的线程处理程序</p>
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
    * <p>处理流水对象</p>
    * @param strBranchNum String 分行号
    * @param level int 流水级别
    * @param strJournal String 流水内容
    * @return boolean 是否成功
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
