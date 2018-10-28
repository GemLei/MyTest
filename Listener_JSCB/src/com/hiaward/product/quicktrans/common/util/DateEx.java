package com.hiaward.product.quicktrans.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;


/**
 * <p>Title: ���ڹ�����</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: Hiaward</p>
 * @author ZhuJian
 * @version 1.0
 * <p>2006/9/1 ZhuJian First release</p>
 */
public class DateEx extends Date
{
  /**
   * <p>���캯����ȡ��ǰ����ʱ�䣩</p>
   */
  public DateEx()
  {
    super();
  }

  /**
   * <p>���캯��</p>
   * @param date Date ���ڶ���
   */
  public DateEx(Date date)
  {
    super.setTime(date.getTime());
  }

  /**
   * <p>����ʽ��������ʱ���ַ����������ý����������ʱ��</p>
   * @param strDate Date String in format ("yyyy/MM/dd HH:mm:ss");
   * @return boolean �Ƿ�ɹ�
   */
  public boolean parseDate(String strDate)
  {
    try
    {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = sdf.parse(strDate);
      super.setTime(date.getTime());
      return true;
    }
    catch (Exception e)
    {
    }
    return false;
  }

  /**
   * <p>ȡ���</p>
   * @return int ���
   */
  public int getYear_()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return calendar.get(Calendar.YEAR);
  }

  /**
   * <p>ȡ�·�</p>
   * @return int �·�
   */
  public int getMonth_()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return 1 + calendar.get(Calendar.MONTH);
  }

  /**
   * <p>ȡ����</p>
   * @return int ����
   */
  public int getDayOfMonth()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return calendar.get(Calendar.DAY_OF_MONTH);
  }

  /**
   * <p>ȡ���ڼ�</p>
   * @return int ��1�Ƶ�7
   */
  public int getDayOfWeek()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    // ���� 1-7 �ֱ��ʾ �����죭������
    int i = calendar.get(Calendar.DAY_OF_WEEK);
    if (i == 1)
      return 7;
    else
      return i-1;
  }

  /**
   * <p>ȡСʱ</p>
   * @return int Сʱ
   */
  public int getHourOfDay()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return calendar.get(Calendar.HOUR_OF_DAY);
  }

  /**
   * <p>ȡ����</p>
   * @return int ����
   */
  public int getMinute()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return calendar.get(Calendar.MINUTE);
  }

  /**
   * <p>ȡ����</p>
   * @return int ����
   */
  public int getSecond()
  {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this);
    return calendar.get(Calendar.SECOND);
  }

  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("yyyy/MM/dd HH:mm:ss")
   */
  public String getDateTimeStrFull()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    return sdf.format(this);
  }

  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("yyyyMMdd HHmmss")
   */
  public String getDateTimeStrSimple()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
    return sdf.format(this);
  }

  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("yyyyMMdd")
   */
  public String getDateStrSimple()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    return sdf.format(this);
  }
  
  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("yyyy-MM-dd")
   */
  public String get_DateStrSimple()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(this);
  }

  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("HHmmss")
   */
  public String getTimeStrSimple()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
    return sdf.format(this);
  }
  
  /**
   * ��ʱ������ת��Ϊ��hhmmMMDDYY��ʽ
   */
  public String getTimeDateSpecial(){
	  SimpleDateFormat sdf = new SimpleDateFormat("HHmmMMddyy");
	  return sdf.format(this);
  }

  /**
   * <p>Formats a Date into a date/time string</p>
   * @return String the formatted time string. format ("HH:mm:ss")
   */
  public String getTimeStrFull()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    return sdf.format(this);
  }

  /**
   * <p>�õ�ĳһ���µ��������</p>
   * @param strYear ����
   * @param strMonth �·�
   * @return int �������
   * <p>�����·�ֵ������1-12</p>
   */
  public static int getMonthDayNumber(String strYear, String strMonth)
  {
    int year = DataConversion.str2Int(strYear, 1980);
    int month = DataConversion.str2Int(strMonth, 1);
    return getMonthDayNumber(year, month);
  }

  /**
   * <p>�õ�ĳһ���µ��������</p>
   * @param year ����
   * @param month �·�
   * @return int �������
   * <p>�����·�ֵ������1-12</p>
   */
  public static int getMonthDayNumber(int year, int month)
  {
      Calendar cal = Calendar.getInstance();
      cal.setTime(new Date());
      // ����Ǳ��£��ͷ��ؽ��������
      if (cal.get(cal.YEAR) == year && cal.get(cal.MONTH)+1 == month)
        return cal.get(cal.DATE);

      cal.set(year, month-1, 1);
      return cal.getActualMaximum(cal.DATE);
  }

  /**
   * <p>�õ�һ������֮����������¼��ϣ�������ʼ�ͽ������ڱ���</p>
   * @param strStartDate ��ʼ����
   * @param strEndDate ��������
   * @return Object[] �����ַ�������
   */
  public static Object[] getMonthArray(String strStartDate, String strEndDate)
  {
    ArrayList strArrList = new ArrayList();
    if (strStartDate.length() == 6 && strEndDate.length() == 6)
    {
      int iStartYear = DataConversion.str2Int(strStartDate.substring(0,4), 1980);
      int iStartMonth = DataConversion.str2Int(strStartDate.substring(4,6), 1);
      int iEndYear = DataConversion.str2Int(strEndDate.substring(0,4), 1980);
      int iEndMonth = DataConversion.str2Int(strEndDate.substring(4,6), 1);

      Calendar calEnd = Calendar.getInstance();
      calEnd.set(iEndYear, iEndMonth, 1);

      Calendar calStart = Calendar.getInstance();
      calStart.set(iStartYear, iStartMonth-1, 1);
      while (calStart.before(calEnd))
      {
        String str = DataConversion.getZeroPrefixStr(String.valueOf(calStart.get(calStart.YEAR)), 4) +
          DataConversion.getZeroPrefixStr(String.valueOf(calStart.get(calStart.MONTH)+1), 2);
        strArrList.add(str);
        calStart.add(calStart.MONTH, 1);
      }
    }
    return strArrList.toArray();
  }
}
