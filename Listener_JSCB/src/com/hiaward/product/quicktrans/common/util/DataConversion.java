package com.hiaward.product.quicktrans.common.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.hiaward.product.quicktrans.common.util.CryptoUtils;

/**
 * <p>Title:����ת��������</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: hiaward</p>
 * @version 1.0 2006/6/8 zhujian ����
 *              2006/8/25 ������ ����separate���ָ��ַ�����
 */
public class DataConversion
{
	

  /**
   * <p>�ַ���ת��Ϊ����</p>
   * @param str String �ַ���
   * @param iDef int ���ת��ʧ�ܣ�ȱʡ����������ֵ
   * @return int ת���������
   */
  public static int str2Int(String str, int iDef)
  {
    int iRet = iDef;
    try
    {
      iRet = Integer.valueOf(str, 10).intValue();
    }
    catch (Exception e)
    {
    }
    return iRet;
  }

  /**
   * <p>�ַ���ת��Ϊ������</p>
   * @param str �ַ���
   * @param fDefault ȱʡֵ
   * @return float ת����ĸ�����ֵ�����ת��ʧ�ܷ���ȱʡֵ
   */
  public static float str2Float(String str, float fDefault)
  {
    float fRet = fDefault;
    try
    {
      if (str != null)
        fRet = new Float(str).floatValue();
    }
    catch (Exception e)
    {
    }
    return fRet;
  }

  /**
   * <p>�ַ���ת��Ϊ˫������</p>
   * @param str �ַ���
   * @param dDefault ȱʡֵ
   * @return Double ת����ĸ�����ֵ�����ת��ʧ�ܷ���ȱʡֵ
   */
  public static Double str2AmountDouble(String str, double dDefault)
  {
    DecimalFormat format = new DecimalFormat("0.00");
    Double dRet = null;
    try
    {
      if (str != null)
      {
          dRet = Double.valueOf(str);
          dRet = Double.valueOf(format.format(dRet.doubleValue()));
      }
    }
    catch (Exception e)
    {
        dRet = null;
    }
    
    if (null == dRet)
    {
        dRet = Double.valueOf(format.format(dDefault));
    }
    
    return dRet;
  }
  
  /**
   * <p>�ָ��ַ���</p>
   * @param  strWhole String ���ָ���ַ���
   * @param  chSep char   �ָ��ַ�
   * @return Object[] �ָ���Object�������飨ʵ�����ַ������飩
   */
  public static Object[] separate(String strWhole, char chSep)
  {
    // ��ʼ�����б�����Ϊ16������ÿ��addʱ���·���ռ䣬�˷�ʱ��
    ArrayList arrList = new ArrayList(16);

    int nlen = strWhole.length();
    int i = 0, iprev = 0;
    for (; i < nlen; i++)
    {
      if (strWhole.charAt(i) == chSep)
      {
        // �˴�ȥ����β�Ŀո�
        arrList.add(strWhole.substring(iprev, i).trim());
        iprev = i + 1;
      }
    }
    // ȡĩβ���ַ���
    arrList.add(strWhole.substring(iprev, i).trim());

    return arrList.toArray();
  }


  /**
   * <p>�޷���BYTEת��Ϊ������</p>
   * @param btVal BYTEֵ
   * @return int ������
   */
  public static int unsignedByte2Int(byte btVal)
  {
    int iRet;
    if (btVal >= 0)
      iRet = btVal;
    else
      iRet = 256 + btVal;
    return iRet;
  }

  /**
   * <p>����ת��ΪBYTE����</p>
   * @param iVal ������
   * @param byteArr BYTE����
   * @param startPos ������ʼλ��
   */
  public static void int2ByteArr(int iVal, byte[] byteArr, int startPos)
  {
    byteArr[startPos] = (byte) (iVal / (256 * 256 * 256));
    byteArr[startPos + 1] = (byte) (iVal % (256 * 256 * 256) / (256 * 256));
    byteArr[startPos + 2] = (byte) (iVal % (256 * 256) / 256);
    byteArr[startPos + 3] = (byte) (iVal % 256);
  }

  /**
   * <p>�õ������ε�����byte�����ʾ<p>
   * @param sValue ��������
   * @return byte[] ����Ϊ2��byte����
   */
  public static byte[] short2ByteArr(short sValue)
  {
    byte[] byteArr = new byte[2];
    byteArr[0] = (byte) (sValue / 256);
    byteArr[1] = (byte) (sValue % 256);

    return byteArr;
  }

  /**
   * <p>������ת��ΪBYTE����</p>
   * @param sVal ��������
   * @param byteArr BYTE����
   * @param startPos ������ʼλ��
   */
  public static void short2ByteArr(short sVal, byte[] byteArr, int startPos)
  {
    byteArr[startPos] = (byte) (sVal / 256);
    byteArr[startPos + 1] = (byte) (sVal % 256);
  }


  /**
   * <p>BYTE����ת��Ϊ����</p>
   * @param byteArr BYTE����
   * @param startPos ������ʼλ��
   * @return int ������
   */
  public static int byteArr2Int(byte[] byteArr, int startPos)
  {
    short shortHi = byteArr2Short(byteArr, startPos);
    short shortLo = byteArr2Short(byteArr, startPos + 2);
    int iRet = shortHi * 256 * 256 + shortLo;
    return iRet;
  }

  /**
   * <p>BYTE����ת��Ϊ����</p>
   * @param byteArr BYTE����
   * @return int ������
   */
  public static int byteArr2Int(byte[] byteArr)
  {
    return byteArr2Int(byteArr, 0);
  }

  /**
   * <p>BYTE����ת��Ϊ������</p>
   * @param byteArr BYTE����
   * @return short ��������
   */
  public static short byteArr2Short(byte[] byteArr)
  {
    short sRet = (short) (byteArr[0] * 256 + byteArr[1]);
    return sRet;
  }

  /**
   * <p>BYTE����ת��Ϊ������</p>
   * @param byteArr BYTE����
   * @param startPos ������ʼλ��
   * @return short ��������
   */
  public static short byteArr2Short(byte[] byteArr, int startPos)
  {
    short sRet = (short) (unsignedByte2Int(byteArr[startPos]) * 256 + unsignedByte2Int(byteArr[startPos + 1]));
    return sRet;
  }


  /**
   * <p>ʮ�������ַ���ת����������</p>
   * @param strHex ��ת�����ַ���
   * @return byte[] ����ת�����byte���飬���ʧ�ܷ���null
   */
  public static byte[] hex2Byte(String strHex)
  {
    return CryptoUtils.toBytesBlock(strHex);
  }

  /**
   * <p>ʮ�������ַ���ת����������</p>
   * @param strHex ��ת�����ַ���
   * @param byteArrDest Ŀ������
   * @param iDestPos Ŀ��������ʼλ��
   * @return int ת�����ֽ�����ʧ�ܷ���-1
   */
  public static int hex2Byte(String strHex, byte[] byteArrDest, int iDestPos)
  {
    int iRet = -1;

    byte[] byteArr = hex2Byte(strHex);
    if (byteArr != null && byteArr.length > 0 && byteArr.length <= byteArrDest.length - iDestPos)
    {
      System.arraycopy(byteArr, 0, byteArrDest, iDestPos, byteArr.length);
      iRet = byteArr.length;
    }

    return iRet;
  }

  /**
   * <p>�õ����ַ�ch��׺���ַ���</p>
   * @param str ԭʼ�ַ���
   * @param ch ��׺�ַ�
   * @param nWantLength ϣ�����ַ�������
   * @return String ����ΪnWantLength���ַ��������㳤�ȵĺ��ַ�ch
   */
  public static String getSuffixStr(String str, char ch, int nWantLength)
  {
    if (str == null)
      str = "";

    if (str.length() >= nWantLength)
      return str;

    StringBuffer strbuf = new StringBuffer(nWantLength);
    strbuf.append(str);
    while (strbuf.length() < nWantLength)
      strbuf.append(ch);
    return strbuf.toString();
  }

  /**
   * <p>�ַ���ת��ΪBYTE����</p>
   * @param byteArrDest Ŀ��BYTE����
   * @param iDestPos ������ʼλ��
   * @param str �ַ���
   * @param iWantedLen ϣ���ĳ���
   * <pre>����iWantedLen����ʱ��
   *  strFormat = "-A"    ǰ��A
   *  strFormat = "A"     ��A
   *  strFormat = null    �󲹿ո�
   * </pre>
   */
  public static void str2ByteArr(byte[] byteArrDest, int iDestPos, String str, int iWantedLen, String strFormat)
  {
    String strFixedLen = str;

    if (strFormat != null && strFormat.length() > 0)
    {
      if (strFormat.length() == 2 && strFormat.charAt(0) == '-')
        strFixedLen = DataConversion.getPrefixStr(str, strFormat.charAt(1), iWantedLen);
      else
        strFixedLen = DataConversion.getSuffixStr(str, strFormat.charAt(0), iWantedLen);
    }
    else
    {
      strFixedLen = DataConversion.getSuffixStr(str, ' ', iWantedLen);
    }

    System.arraycopy(strFixedLen.getBytes(), 0, byteArrDest, iDestPos, iWantedLen);
  }


  /**
   * <p>�õ����ַ�chǰ׺���ַ���</p>
   * @param str ԭʼ�ַ���
   * @param ch ǰ׺�ַ�
   * @param nWantLength ϣ�����ַ�������
   * @return String ����ΪnWantLength���ַ��������㳤�ȵ�ǰ���ַ�ch
   */
  public static String getPrefixStr(String str, char ch, int nWantLength)
  {
    if (str == null)
      str = "";

    int strlen = str.length();
    if (strlen >= nWantLength)
      return str;

    StringBuffer strbuf = new StringBuffer(nWantLength);
    while (strbuf.length() < nWantLength-strlen)
      strbuf.append(ch);
    strbuf.append(str);
    return strbuf.toString();
  }

  /**
   * <p>��ʽ������������Ϊʮ�����ƺ�ASCII�ַ���������ʽ</p>
   * @param byteArr ���������ݵ�BYTE����
   * @return String ��ʽ������ַ���
   */
  public static String formatBinaryData(byte[] byteArr, int len)
  {
    int COLPERROW = 16;
    StringBuffer strRet = new StringBuffer(len*6);
    int iLen = len <= 0 ? byteArr.length : len;

    for (int iRow = 0; iRow * COLPERROW < iLen; iRow++)
    {
      strRet.append(DataConversion.getPrefixStr(new Integer(iRow * COLPERROW).toString(), '0', 4) + "  ");

      int iCol;
      for (iCol = 0; iCol < COLPERROW && iRow * COLPERROW + iCol < iLen; iCol++)
      {
        byte bytetmp = byteArr[iRow * COLPERROW + iCol];
        strRet.append(" ");
        strRet.append(CryptoUtils.hex_asc_tab[ ( bytetmp >>> 4) & 0x0f ]);
        strRet.append(CryptoUtils.hex_asc_tab[ ( bytetmp      ) & 0x0f ]);
      }
      for (; iCol < COLPERROW; iCol++)
        strRet.append("   ");

      strRet.append("\t");
      for (iCol = 0; iCol < COLPERROW && iRow * COLPERROW + iCol < iLen; iCol++)
      {
        if (!Character.isISOControl((char) byteArr[iRow * COLPERROW + iCol]))
          strRet.append((char)byteArr[iRow * COLPERROW + iCol]);
        else
          strRet.append("*");
      }

      strRet.append("\r\n");
    }

    return strRet.toString();
  }


  /**
   * <p>����������תʮ�������ַ���</p>
   * @param byteArr ��ת����byte����
   * @return String ����ת����Ĵ�д�ַ���
   */
  public static String byte2Hex(byte[] byteArr)
  {
    return CryptoUtils.toStringBlock(byteArr);
  }


  /**
   * <p>��ʽ������ֵ�ַ���Ϊ Px.2 ��ʽ</p>
   * @param strVal
   * @return String ��ʽ������ַ���
   */
  public static String FormatMoneyVal(String strVal)
  {
    String strRet = strVal;
    try
    {
      double dbVal = new Double(strVal).doubleValue();
      NumberFormat nf = NumberFormat.getInstance();
      nf.setMinimumFractionDigits(2);
      nf.setMaximumFractionDigits(2);
      nf.setGroupingUsed(false);
      strRet = nf.format(dbVal);
    }
    catch (Exception e)
    {
    }
    return strRet;
  }

  /**
   * <p>�Ѵ����ݿ��ж����������ַ���ת��Ϊ�������</p>
   * @param str �ַ���
   * @param strGBName ���Ĺ��������
   * @return String ����ת������ַ���
   */
  public static String convertFromChinese(String str, String strGBName)
  {
    try
    {
      return new String(str.getBytes(), strGBName);
    }
    catch (Exception e)
    {
    }
    return str;
  }


  /**
   * <p>�õ����ַ�'0'ǰ׺���ַ���</p>
   * @param str ԭʼ�ַ���
   * @param nWantLength ϣ�����ַ�������
   * @return String ����ΪnWantLength���ַ��������㳤�ȵ�ǰ���ַ�'0'
   */
  public static String getZeroPrefixStr(String str, int nWantLength)
  {
    return getPrefixStr(str, '0', nWantLength);
  }

  /**
   * <p>�õ�����ֵ��������Ľ��</p>
   * @param hexstr1 ������������ʮ�������ַ���1
   * @param hexstr2 ������������ʮ�������ַ���2
   * @return String �����������ʮ�������ַ�����ʧ�ܷ���null
   */
  public static String xor(String hexstr1, String hexstr2)
  {
    String hexstrRet = "";
    byte[] byteArr1 = hex2Byte(hexstr1);
    byte[] byteArr2 = hex2Byte(hexstr2);

    if (byteArr1 != null && byteArr2 != null && byteArr1.length == byteArr2.length)
    {
      for (int i=0; i<byteArr1.length; i++)
      {
        hexstrRet += getZeroPrefixStr(Integer.toHexString((byteArr1[i]^byteArr2[i]) & 0xFF), 2).toUpperCase();
      }
    }

    return hexstrRet;
  }

  /**
   * <p>��ʽ����ֵ�ַ���Ϊָ����λ�;��ȵĸ�ʽ</p>
   * @param strVal ��ֵ�ַ���
   * @param iIntegerDigitsNum  ����λ��
   * @param iFractionDigitsNum С��λ��
   * @return String ��ʽ������ַ���
   */
  public static String formatNumVal(String strVal, int iIntegerDigitsNum, int iFractionDigitsNum)
  {
    String strRet = strVal;
    try
    {
      double dbVal = new Double(strVal).doubleValue();
      NumberFormat nf = NumberFormat.getInstance();
      nf.setMinimumIntegerDigits(iIntegerDigitsNum);
      nf.setMaximumIntegerDigits(iIntegerDigitsNum);
      nf.setMinimumFractionDigits(iFractionDigitsNum);
      nf.setMaximumFractionDigits(iFractionDigitsNum);
      nf.setGroupingUsed(false);
      strRet = nf.format(dbVal);
    }
    catch (Exception e)
    {
    }
    return strRet;
  }

  /**
   * <p>ɾ���ַ���β���Ŀո�</p>
   * @param str String Դ�ַ���
   * @return String �������ַ���
   */
  public static String trimRight(String str)
  {
    int i = str.length()-1;
    for (; i>=0 && (str.charAt(i)==' ' || str.charAt(i) == '\r' || str.charAt(i) == '\n'); i--);
    if (i < str.length() -1)
      str = str.substring(0, i+1);
    return str;
  }
  /**
   * <p>ɾ���ַ���β���Ŀո�</p>
   * @param str String Դ�ַ���
   * @return String �������ַ���
   */
  public static String listToString(List list)
  {
	  
   if(null==list) return "";
   String str="";
   int i=0;
   for(Object s:list.toArray()){
	   if(i++==0)
	  str=(String)s;
	   else str=str+","+(String)s;
	   
   }
  
    return str;
  }

  /**
   * <p>ת��ΪUnicode�����ʮ�������ַ������������ĸ��ַ���Ӣ�������ַ���</p>
   * @param str String Դ�ַ���
   * @return String Unicode�����ʮ�������ַ�����
   */
  public static String str2UnicodeHex(String str)
  {
    try
    {
      byte[] bytes = str.getBytes("UTF-16");
      StringBuffer strRet = new StringBuffer(bytes.length);
      for (int i=2; i+1<bytes.length; i+=2)
      {
        if (bytes[i] != 0)
        {
          strRet.append(CryptoUtils.hex_asc_tab[(bytes[i] >>> 4) & 0x0f]);
          strRet.append(CryptoUtils.hex_asc_tab[(bytes[i]) & 0x0f]);
        }
        strRet.append(CryptoUtils.hex_asc_tab[(bytes[i+1] >>> 4) & 0x0f]);
        strRet.append(CryptoUtils.hex_asc_tab[(bytes[i+1]) & 0x0f]);
      }
      return strRet.toString();
    }
    catch (Exception e)
    {
      return str;
    }
  }
  /**
   * <p>�õ��Է�Ϊ��λ���ַ���</p>
   * @param str String Դ�ַ���
   * @return String �������ַ���
   */
  public static String getMoneyToFen(String strMoney)
  {
	    String strM = "";
	    if(strMoney.lastIndexOf('.')== -1 )
	    {
	      strM = strMoney +"00";
	    }
	    else 
	    {
	      strM  =FormatMoneyVal(strMoney);
	      strM = strM.substring(0,strM.indexOf('.')) + strM.substring(strM.indexOf('.')+1) ;
	    }
	  return strM;
  }
  
  /**
   * <p>���Գ������</p>
   * @param args String[]
   * @throws Exception
   */
  public static void main(String args[]) throws Exception
  {
    /*// ��ɫҵ�����޷�ͨ�����ܻ���֤������ʹ��md5��֤��������������
    String strData2ValidateMac;
    byte[] byteArrMd5Data;

    strData2ValidateMac = "c=���һ��ͨab";
    //System.out.println(DataConversion.str2UnicodeHex(strData2ValidateMac));

    strData2ValidateMac = "MsgType=Transaction&TransCode=0200_00000_010000&Pan=3568560000000035&CardType=12000&CardTypeBasic=12000&Track2=3568560000000035!3D10021010411149900000&Track3=994221889990000029!3D170210109126299000000003976999236000002070000000000000000000000!3D000000000000!3D0000000&BankNumOfCard=asdasd&PinBlock=7549626BC59731CC&TermNum=01000008&Amount=100&BmkIndex=-1&CardName=����ũ����&BankNameOfCard=���һ��ͨ&Mac=";
    byteArrMd5Data = Md5.getDigest(DataConversion.hex2Byte(DataConversion.str2UnicodeHex(strData2ValidateMac)));
    //System.out.println(DataConversion.byte2Hex(byteArrMd5Data));

    strData2ValidateMac = "MsgType=Transaction&TransCode=0200_00000_010000&Pan=3568560000000035&CardType=12000&CardTypeBasic=12000&Track2=3568560000000035!3D10021010411149900000&Track3=994221889990000029!3D170210109126299000000003976999236000002070000000000000000000000!3D000000000000!3D0000000&BankNumOfCard=asdasd&PinBlock=7549626BC59731CC&TermNum=01000008&Amount=100&BmkIndex=-1&CardName=jcb&BankNameOfCard=123123&Mac=";
    byteArrMd5Data = Md5.getDigest(DataConversion.hex2Byte(DataConversion.str2UnicodeHex(strData2ValidateMac)));
    //System.out.println(DataConversion.byte2Hex(byteArrMd5Data));
    byteArrMd5Data = Md5.getDigest(strData2ValidateMac.getBytes());
    //System.out.println(DataConversion.byte2Hex(byteArrMd5Data));
    
    ArrayList al=new ArrayList();
    al.add("123");
    al.add("456");
    al.add("789");
    //System.out.println(listToString(al));
*/   
  }
}
