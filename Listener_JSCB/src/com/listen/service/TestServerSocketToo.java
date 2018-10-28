package com.listen.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.List;

import org.jdom.Element;

import com.hiaward.product.quicktrans.common.util.XmlParam;

public class TestServerSocketToo extends Thread {
    private Socket client;
    protected final static int SOCK_HEAD_LENGTH = 5;
    protected static String filepath = "";

    public TestServerSocketToo(Socket c) {
        this.client = c;
    }

    public void run()

    {
        InputStream in = null;
        OutputStream out = null;
        // InputStream inn = null;
        try {
            // sleep(40000);
            in = client.getInputStream();
            out = client.getOutputStream();
            byte[] byteArrBuf = new byte[102400];
            byte[] byteArrRecv = null;
            int nRead = 0;
            do {
                nRead = in.read(byteArrBuf, 0, byteArrBuf.length);
                if (nRead > 0) {
                    byte[] byteArrRecvTemp = new byte[(null == byteArrRecv ? 0 : byteArrRecv.length) + nRead];
                    if (null != byteArrRecv) {
                        System.arraycopy(byteArrRecv, 0, byteArrRecvTemp, 0, byteArrRecv.length);
                        System.arraycopy(byteArrBuf, 0, byteArrRecvTemp, byteArrRecv.length, nRead);
                    } else {
                        System.arraycopy(byteArrBuf, 0, byteArrRecvTemp, 0, nRead);
                    }

                    byteArrRecv = byteArrRecvTemp;
                }
            } while (nRead >= byteArrBuf.length);

            // String requestMsg = new String(byteArrRecv,"utf-8").toString();
            // System.out.println(new Date().toString());
            // System.out.println("锟斤拷锟酵憋拷锟侥ｏ拷"+new String(requestMsg));
            // XmlParam responseXML = new XmlParam();
            // //
            // System.out.println("-------------------------------"+requestMsg.trim().substring(7));
            // boolean loadXmlflag =
            // responseXML.loadXML(requestMsg.trim().substring(4));
            // Element requestId = null;
            // Element requestICId = null;
            // String servicecode = null;
            // requestId =
            // (Element)responseXML.getNodes("/Service/Service_Header/service_id").get(0);
            // servicecode = requestId.getValue();
            // System.out.println("锟斤拷锟截憋拷锟斤拷锟侥硷拷锟斤拷"+servicecode+".test");
            // System.out.println(new Date().toString());
            // inn = new FileInputStream(filepath + servicecode+".test");
            // byte[] bb = new byte[15240];
            // int len = inn.read(bb);
            // inn.close();
            // byte[] sendbyte = new String(bb).trim().getBytes("utf-8");
            // System.out.println("锟斤拷锟截憋拷锟侥ｏ拷"+new String(bb).trim());
            // out.write(sendbyte,0,sendbyte.length);

            String requestMsg = new String(byteArrRecv, "utf-8").toString();
            System.out.println("接收到发送的报文为：" + requestMsg);
            String transcode = "";
            // 锟斤拷锟斤拷
            if (requestMsg.substring(0, 10).equals("1234567890")) {
                transcode = "compareFaces";
            } else {
                String requestMsgtemp = requestMsg.substring(10, requestMsg.length());

                XmlParam responseXML = new XmlParam();
                // System.out.println("---"+requestMsg.trim());
                boolean loadXmlflag = responseXML.loadXML(requestMsgtemp.trim());
                if (!loadXmlflag) {
                    requestMsgtemp = requestMsg.substring(2, requestMsg.length());
                    responseXML.loadXML(requestMsgtemp.trim());
                }
                // String transcode = elementValue(responseXML);//锟斤拷庄
                transcode = elementValueByJINSHANG(responseXML);// 锟斤拷锟斤拷
                System.out.println("返回的报文:" + transcode + ".txt");
            }
            if ( Listener.strClassPath == null || Listener.strClassPath.equals("") ) {
                Listener.strClassPath  = this.getClass().getResource("/").getPath();            

            }
            InputStream inn = new FileInputStream(Listener.strClassPath + java.io.File.separator + "jinshangMessage" + java.io.File.separator + transcode + "_accept.txt");
            StringBuffer strBuffer = new StringBuffer();
            // BufferedReader br = new BufferedReader(new InputStreamReader(new
            // FileInputStream(filepath + transcode+".txt"),"utf-8"));
            /*
             * String lineTxt = null; while((lineTxt = br.readLine())!=null){
             * strBuffer.append(lineTxt); }
             */
            byte[] bb = new byte[10240000];
            int len = inn.read(bb);
            inn.close();
            byte[] sendbyte = new String(bb).trim().getBytes();
            System.out.println("返回的报文为：" + new String(bb).trim());
            out.write(sendbyte, 0, sendbyte.length);
            // System.out.println("锟斤拷锟截的憋拷锟侥ｏ拷"+strBuffer.toString());
            // out.write(new Byte(strBuffer.toString()));
            out.close();
            in.close();

            client.close();
            in = null;
            client = null;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // try {
            // out.close();
            // in.close();
            // client.close();
            // } catch (IOException e) {
            // e.printStackTrace();
            // }
            // inn = null;
            // in = null;
            // client = null;

        }
    }

    public static String elementValue(XmlParam responseXML) {
        List<Element> templist = responseXML.getNodes("/Service/Service_Header/service_id");
        List<Element> templist1 = responseXML.getNodes("/Service/Service_Body/request/jydm");
        String transcode = "";
        String transcode1 = "";
        transcode = templist.get(0).getValue();
        System.out.println("---------------" + transcode);
        if ("01300000000000".equals(transcode)) {
            transcode1 = templist1.get(0).getValue();
            transcode = transcode + "_" + transcode1;
        }
        if ("01230000000000".equals(transcode)) {
            List<Element> templist2 = responseXML.getNodes("/Service/Service_Body/request/qyzt");
            String qyzt = "";
            for (Element e : templist2) {
                System.out.println("锟斤拷锟斤拷锟饺≈�:" + e);
                if (null != e) {
                    qyzt = templist2.get(0).getValue();
                }
            }

            if ("2".equals(qyzt)) {
                transcode += "_signed";
            }

        }
        // for(int i=0;i<templist.size();i++)
        // {
        // Element temp = (Element)templist.get(i);
        // if(temp.getAttributeValue("name").equals("service_id"))
        // {
        // transcode = temp.getValue();
        // break;
        // }
        // }

        return transcode.trim();
    }

    public static String elementValueByJINSHANG(XmlParam responseXML) {
        List<Element> templist = responseXML.getNodes("/service/sys-header/data/struct/data");
        if (templist == null) {
            templist = responseXML.getNodes("/union/head/serviceCode");
            return templist.get(0).getValue();
        }
        String transcode = "";
        String transtype = "";
        for (int i = 0; i < templist.size(); i++) {
            if (templist.get(i).getAttributeValue("name").equals("MESSAGE_CODE")) {
                transcode = templist.get(i).getValue();
            }
            if (templist.get(i).getAttributeValue("name").equals("MESSAGE_TYPE")) {
                transtype = templist.get(i).getValue();
            }
        }

        System.out.println("---------------" + transcode);
        return transtype.trim() + "_" + transcode.trim();
    }

    public static String getHeadlen(String strHead) {
        int i = strHead.length();
        for (int j = i; j < SOCK_HEAD_LENGTH; j++) {
            strHead = "0" + strHead;
        }
        return strHead;
    }
}
