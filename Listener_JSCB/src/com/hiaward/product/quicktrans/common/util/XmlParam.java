package com.hiaward.product.quicktrans.common.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;

import com.hiaward.product.quicktrans.common.constant.Constant;

/**
 * <p>Title: XML��ʽ�Ĳ��������ļ���ȡ��</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: Hiaward</p>
 * @version 1.0 2006/8/30 �콨 ����<br/>
 * @version 1.1 2009/4/22 llx �޸���ӦxBankBass
 */
public class XmlParam 
{
    protected String strXmlFilePathName;
    protected Document document;

    /**
     * <p>���캯��</p>
     * 
     * @param strXmlFilePathName String �����ļ�·����
     */
    public XmlParam(String strXmlFilePathName)
    {
        this.strXmlFilePathName = strXmlFilePathName;
    }

    /**
     * <p>�չ��캯�������������loadXML����xml�ַ���</p>
     */
    public XmlParam()
    {
    }

    /**
     * <p>��ȡ���ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @param strValDefault String ������ȱʡֵ
     * @return String ����ֵ�����ȡֵʧ�ܣ��򷵻�ȱʡֵ
     */
    public String getParamVal(String strXPath)
    {
        String strRet = null;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            strRet = ((Element) xpath.selectSingleNode(document)).getText();
        }
        catch (Exception e)
        {
        }

        return strRet;
    }

    /**
     * <p>��ȡ���ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return ArrayList ����ֵlist�����ȡֵʧ�ܣ��򷵻�ȱʡֵ
     */
    public ArrayList getParamVals(String strXPath)
    {
        List list = null;
        ArrayList stringarray = new ArrayList();
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            //list = xpath.selectNodes(document);//annotaion by bxs for weblogic10.3.5
            list = getPathNodes(strXPath);
            for (int nloop = 0; nloop < list.size(); nloop++)
            {
                stringarray.add(((Element) list.get(nloop)).getText());
            }
        }
        catch (Exception e)
        {
            stringarray = null;
        }

        return stringarray;
    }

    /**
     * <p>��ȡ���ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return ArrayList ����ֵlist�����ȡֵʧ�ܣ��򷵻�ȱʡֵ
     */
    public ArrayList getParamVals(Element element, String strXPath)
    {
        List list = null;
        ArrayList stringarray = new ArrayList();
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            //list = xpath.selectNodes(element);//annotaion by bxs for weblogic10.3.5
            list = getPathNodes(strXPath);
            for (int nloop = 0; nloop < list.size(); nloop++)
            {
                stringarray.add(((Element) list.get(nloop)).getText());
            }
        }
        catch (Exception e)
        {
            stringarray = null;
        }

        return stringarray;
    }
    
    
    /**
     * @param encode �ַ�����
     * ��XML����ת��Ϊָ���ַ���������ַ���
     */
    public String xmlToString(String encode)
    {
    	ByteArrayOutputStream byteRep = null;
    	
    	try
    	{
    		byteRep = new ByteArrayOutputStream();
            Format format = Format.getPrettyFormat();
            format.setEncoding(encode);
            XMLOutputter docWriter = new XMLOutputter(format);
            docWriter.output(document, byteRep);
            return byteRep.toString(encode);
            
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return "";
    }
    

    /**
     * <p>��ȡ���ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return List[] ����ֵlist[]����Ŷ���Ԫ�ص�List����
     */
    public List[] getNodeChildObjects(String strXPath)
    {
        List list = null;
        List childArray = new ArrayList();
        List[] listElement;
        Element element = null;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            list = xpath.selectNodes(document);

            //���岢��ʼ������List����
            listElement = new ArrayList[list.size()];
            for (int i=0; i<listElement.length; i++)
            {
                listElement[i] = new ArrayList();
            }
            
            //ȡxml�ڵ��Ԫ�ؼӵ�List������
            for (int nloop = 0; nloop < list.size(); nloop++)
            {
                childArray = ((Element) list.get(nloop)).getChildren(); 
                for (int i = 0; i<childArray.size(); i++)
                {
                    element = (Element)childArray.get(i);
                    listElement[nloop].add(element);
                }
            }
        }
        catch (Exception e)
        {
            childArray = null;
            listElement = null;
        }
        
        return listElement;
    }
    /**
     * <p>��ȡRecords�б�ÿ��Recordһ��hashmap   </p>
     * @author by hhmao 2010-7-24
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return List ����ֵlist�����hashmapԪ��
     */
    public List getRecords(String strXPath)
    {
        List list = null;
        List childArray = new ArrayList();
        List listHashMap;
        Element element = null;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
           // list = xpath.selectNodes(document);//annotaion by bxs for weblogic10.3.5
            list = getPathNodes(strXPath);

            //���岢��ʼ������List����
            listHashMap = new ArrayList();
           
            
            //ȡxml�ڵ��Ԫ�ؼӵ�List������
            for (int nloop = 0; nloop < list.size(); nloop++)
            {
                childArray = ((Element) list.get(nloop)).getChildren(); 
                HashMap hm=new HashMap();
                for (int i = 0; i<childArray.size(); i++)
                {
                    element = (Element)childArray.get(i);
                    hm.put(element.getName(), element.getText());
                    
                }
                listHashMap.add(hm);
            }
        }
        catch (Exception e)
        {
            childArray = null;
            listHashMap = null;
        }
        
        return listHashMap;
    }

    /**
     * <p>��ȡָ��·���ڵ�</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return List[] �ڵ�����
     */
    public List getNodes(String strXPath)
    {
        List list = null;
        try
        {
        	
//        	
//        	System.out.println("getNodes1:"+strXPath);
//        	String[] paths = strXPath.split("/");
//        	String singleNodePath = "";
//        	String arrNodePath = "";
//        	for(int i = 0; i < paths.length ; i++)
//        	{
//        		if(i == paths.length -1)
//        		{
//        			arrNodePath = paths[i];
//        			 break;
//        		}
//        		singleNodePath += paths[i];
//        		singleNodePath += "/";
//        	}
//        	 XPath xpath = XPath.newInstance("/"+singleNodePath);
//        	 Element elements = (Element)xpath.selectSingleNode(document);
//        	 
//        	 List listElement = elements.getChildren();
        	
        	
//        	JDOMXPath x = new JDOMXPath("/"+strXPath);
//        	List templist = x.selectNodes(document);
//        	System.out.println("templist:"+templist);
//            XPath xpath = XPath.newInstance("/"+strXPath);
//            xpath.addNamespace(document.getRootElement().getNamespace());
//            System.out.println("xpath:"+ xpath);
//            list = xpath.selectNodes(document);
//            System.out.println("end:"+ list);
//            System.out.println("document:"+document.toString());
//            XPath xpaths = XPath.newInstance("/"+strXPath);
//            System.out.println("end:"+ xpaths);
        	list = getPathNodes(strXPath);
        }
        catch (Exception e)
        {
            list = null;
            System.out.println("message:"+e.getMessage());
        }
        System.out.println("getNodes:"+list);
        return list;
    }
    
    /**
     * <p>��ȡָ��·���ڵ�</p>
     *
     * @param Element element������XML�ļ��е�xPath·����
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @return List[] �ڵ�����
     */
    public List getNodes(Element element, String strXPath)
    {
        List list = null;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            list = xpath.selectNodes(element);
            // list = xpath.selectNodes(document);
        }
        catch (Exception e)
        {
            list = null;
            e.printStackTrace();
        }
        System.out.println("list:"+list);
        
        return list;
    }
    
    /**
     * <p>��ȡָ��·���ڵ��µĲ���ֵ</p>
     * 
     * @param Element element jdom�ڵ�
     * @param strXPath String �����ڽڵ��µ�xPath·����
     * @return String 
     */
    public String getNodeParamVal(Element element, String strXPath)
    {
        String strRet = null;
        try
        {
            XPath xpath = XPath.newInstance(strXPath);
            strRet = ((Element) xpath.selectSingleNode(element)).getText();
        }
        catch (Exception e)
        {
            strRet = null;
        }
        
        return strRet;
    }
    
    /**
     * <p>��ȡxml�ļ�Node�������ַ���</p>
     * 
     * @param strXPath          String ������XML�ļ��е�xPath·����
     * @return String           ��������ڵ�������ַ���
     */
    public String getNodeString(String strXPath)
    {
        Element element = null;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            element = (Element) xpath.selectSingleNode(document);
            
            XMLOutputter xmlOut = new XMLOutputter(Format.getPrettyFormat());
            return xmlOut.outputString(element);
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    /**
     * <p>��ȡxml�ļ�Node��xml�ı�</p>
     * 
     * @param strXPath          String ������XML�ļ��е�xPath·����
     * @return String           ��������ڵ�������ַ���
     */
    public String getNodeXmlText(Element element)
    {
        try
        {
            XMLOutputter xmlOut = new XMLOutputter(Format.getPrettyFormat());
            return xmlOut.outputString(element);
        }
        catch (Exception e)
        {
        }
        
        return null;
    }
    
    /**
     * <p>�������ļ�</p>
     * 
     * @return boolean �Ƿ�ɹ�
     */
    public boolean open()
    {
        boolean bRet = false;
        try
        {
            SAXBuilder builder = new SAXBuilder();
            document = builder.build(new File(strXmlFilePathName));

            bRet = true;
        }
        catch (Exception e)
        {
        }

        return bRet;
    }

    /**
     * <p>����xml�ַ���</p>
     * 
     * @return boolean �Ƿ�ɹ�
     */
    public boolean loadXML(String strXmlText)
    {
        boolean bRet = false;
        try
        {
            StringReader sr = new StringReader(strXmlText);
            SAXBuilder builder = new SAXBuilder();
            document = builder.build(sr);

            bRet = true;
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            JournalThread.getInstance().append("0000", JournalThread.LEVEL_1,
                    "xml�ļ���ʽ����" + strXmlText);
        }

        return bRet;
    }

    /**
     * <p>�����µ�xml�ļ�</p>
     * 
     * @return boolean �Ƿ�ɹ�
     */
    public boolean createXML()
    {
        boolean bRet = false;
        try
        {
            document = new Document();
            Element rootElement = new Element(Constant.XPATH_ROOT);
            document.setRootElement(rootElement);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append("0000", e);
        }

        return bRet;
    }
    
    
    public boolean createXML(String root)
    {
        boolean bRet = false;
        try
        {
            document = new Document();
            Element rootElement = new Element(root);
            document.setRootElement(rootElement);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append("0000", e);
        }

        return bRet;
    }

    /**
     * <p>�������ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @param strValue String ������ȱʡֵ
     * @return boolean ������� <p> ˵�����ڵ㲻����ʱ�����д��� </p>
     */
    public boolean setParamVal(String strXPath, String strValue)
    {
        boolean bRet = false;
        try
        {
            XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
            Element element = (Element) xpath.selectSingleNode(document);
            if (null != element)
            {
                element.setText(strValue);
            }
            else
            {
                Object[] strPaths = DataConversion.separate(strXPath, '/');
                if (strPaths.length < 1
                        || false == document.getRootElement().getName().equals(
                                (String) strPaths[0]))
                {
                	
                    return false;
                }

                Element parentElement = document.getRootElement();
                for (int nLoop = 1; nLoop < strPaths.length; nLoop++)
                {
                    if (null == (element = (Element) parentElement
                            .getChild((String) strPaths[nLoop])))
                    {
                        element = new Element((String) strPaths[nLoop]);
                        parentElement.addContent(element);
                    }

                    parentElement = element;
                }
                element.setText(strValue);
            }

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append(
                    "0000",
                    JournalThread.LEVEL_1,
                    "����xml��������Դxml��" + toString() + "\r\n·����" + strXPath
                            + "; ֵ��" + strValue);
            e.printStackTrace();
        }

        return bRet;
    }

    /**
     * <p>����ָ���ڵ��µ����ò���ֵ</p>
     * 
     * @param parentElement Element ��Ҫ��Ӳ����ĸ��ڵ㣬һ��Ϊ����appendNode�õ��ķ���ֵ
     * @param strXPath String �����ڽڵ��еĵ�xPath·����
     * @param strValue String ������ȱʡֵ
     * @return boolean ������� <p> ˵���� �ڵ㲻����ʱ�����д��� </p>
     */
    public boolean setParamVal(Element parentElement, String strXPath,
            String strValue,String attributeValue)
    {
        boolean bRet = false;
        try
        {
            Element element = null;
            Object[] strPaths = DataConversion.separate(strXPath, '/');
            for (int nLoop = 0; nLoop < strPaths.length; nLoop++)
            {
                if (null == (element = (Element) parentElement
                        .getChild((String) strPaths[nLoop])))
                {
                    element = new Element((String) strPaths[nLoop]);
                    parentElement.addContent(element);
                }

                parentElement = element;
            }
            if(null != attributeValue && !attributeValue.equals(""))
            {
            	element.setAttribute("name",attributeValue);
            }
            
            element.setText(strValue);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append(
                    "0000",
                    JournalThread.LEVEL_1,
                    "����xml��������Դxml��" + toString() + "\r\n·����" + strXPath
                            + "; ֵ��" + strValue);
        }

        return bRet;
    }
    
    public boolean setParamVal(Element parentElement, String strXPath,
            String strValue,String attributeValue,Integer index)
    {
        boolean bRet = false;
        try
        {
            Element element = null;
            Object[] strPaths = DataConversion.separate(strXPath, '/');
            for (int nLoop = 0; nLoop < strPaths.length; nLoop++)
            {
                if (null == (element = (Element) parentElement
                        .getChild((String) strPaths[nLoop])))
                {
                    element = new Element((String) strPaths[nLoop]);
                    parentElement.setContent(index, element);
                }

                parentElement = element;
            }
            if(null != attributeValue && !attributeValue.equals(""))
            {
            	element.setAttribute("name",attributeValue);
            }
            
            element.setText(strValue);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append(
                    "0000",
                    JournalThread.LEVEL_1,
                    "����xml��������Դxml��" + toString() + "\r\n·����" + strXPath
                            + "; ֵ��" + strValue);
        }

        return bRet;
    }
    /**
     * <p>����ָ���ڵ��µ����ò���ֵ</p>
     * 
     * @param parentElement Element ��Ҫ��Ӳ����ĸ��ڵ㣬һ��Ϊ����appendNode�õ��ķ���ֵ
     * @param strXPath String �����ڽڵ��еĵ�xPath·����
     * @param strValue String ������ȱʡֵ
     * @return boolean ������� <p> ˵���� �ڵ㲻����ʱ�����д��� </p>
     * flage ���ڱ�ʾ �ڵ㲻�����Ƿ񴴽�
     */
    public boolean setParamVal(Element parentElement, String strXPath,
            String strValue,boolean flage)
    {
        boolean bRet = false;
        try
        {
            Element element = null;
            Object[] strPaths = DataConversion.separate(strXPath, '/');
            for (int nLoop = 0; nLoop < strPaths.length; nLoop++)
            {
                if (null == (element = (Element) parentElement
                        .getChild((String) strPaths[nLoop])))
                {
                	if(false == flage)
                	{
                		return bRet;
                	}
                    element = new Element((String) strPaths[nLoop]);
                    parentElement.addContent(element);
                }

                parentElement = element;
            }

            element.setText(strValue);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append(
                    "0000",
                    JournalThread.LEVEL_1,
                    "����xml��������Դxml��" + toString() + "\r\n·����" + strXPath
                            + "; ֵ��" + strValue);
        }

        return bRet;
    }

    /**
     * <p>������ò���ֵ</p>
     * 
     * @param strXPath String ������XML�ļ��е�xPath·����
     * @param strValue String ������ȱʡֵ
     * @return boolean ������� <p> ˵�������Ǵ����µĽڵ㣬����ʵ�ֶ��ͬ·��ͬ���ڵ�Ĵ��� </p>
     */
    public boolean appendParamVal(String strXPath, String strValue)
    {
        boolean bRet = false;
        try
        {
            Object[] strPaths = DataConversion.separate(strXPath, '/');
            if (strPaths.length < 1
                    || false == document.getRootElement().getName().equals(
                            (String) strPaths[0]))
            {
                return false;
            }

            Element element = null;
            Element parentElement = document.getRootElement();
            for (int nLoop = 1; nLoop < strPaths.length - 1; nLoop++)
            {
                if (null == (element = (Element) parentElement
                        .getChild((String) strPaths[nLoop])))
                {
                    element = new Element((String) strPaths[nLoop]);
                    parentElement.addContent(element);
                }

                parentElement = element;
            }

            element = new Element((String) strPaths[strPaths.length - 1]);
            parentElement.addContent(element);
            element.setText(strValue);

            bRet = true;
        }
        catch (Exception e)
        {
            JournalThread.getInstance().append(
                    "0000",
                    JournalThread.LEVEL_1,
                    "����xml��������Դxml��" + toString() + "\r\n·����" + strXPath
                            + "; ֵ��" + strValue);
        }

        return bRet;
    }

    /**
     * <p>��ӽڵ�</p>
     * 
     * @param strXPath String �ڵ��xPath·����
     * @return Element �����ӵĽڵ� 
     * <p> ˵�������Ǵ����µĽڵ㣬����ʵ�ֶ��ͬ·��ͬ���ڵ�Ĵ��� </p>
     */
    public Element appendNode(String strXPath)
    {
        return appendNode(document.getRootElement(), strXPath);
    }

    /**
     * <p>���ؽڵ�</p>
     * 
     * @param strXPath String �ڵ��xPath·����
     * @return Element ָ��·���Ľڵ�
     */
    public Element getNode(String strXPath)
    {
        try
        {
            XPath xpath = XPath.newInstance(strXPath);
            return (Element) xpath.selectSingleNode(document);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * <p>���ظ��ڵ�</p>
     */
    public Element getRootNode()
    {
        return document.getRootElement();
    }
    
    /**
     * <p>��ӽڵ�</p>
     * 
     * @param strXPath String �ڵ��xPath·����
     * @return Element �����ӵĽڵ� <p> ˵�������Ǵ����µĽڵ㣬����ʵ�ֶ��ͬ·��ͬ���ڵ�Ĵ��� </p>
     */
    public Element appendNode(Element parentElement, String strXPath)
    {
        try
        {
            Object[] strPaths = DataConversion.separate(strXPath, '/');
            if (strPaths.length < 1)
            {
                return null;
            }

            Element element = null;
            for (int nLoop = 1; nLoop < strPaths.length - 1; nLoop++)
            {
                if (null == (element = (Element) parentElement
                        .getChild((String) strPaths[nLoop])))
                {
                    element = new Element((String) strPaths[nLoop]);
                    parentElement.addContent(element);
                }

                parentElement = element;
            }

            element = new Element((String) strPaths[strPaths.length - 1]);
            parentElement.addContent(element);

            return element;
        }
        catch (Exception e)
        {
            JournalThread.getInstance()
                    .append(
                            "0000",
                            JournalThread.LEVEL_1,
                            "����xml��������Դxml��" + toString() + "\r\n·����"
                                    + strXPath + ";");
        }

        return null;
    }
    
    /**
     * <p>��ָ���ڵ��е��������ݷ��뵽��ֵ��Map��</p>
     * <p>  �����ڵ�·��</p>
     * <p>  ������ͬ���ڵ�ʱ������ʧ�ܣ���ֹȡֵʧ��</p>
     * @param strXPath �ڵ�·������ʾ���ڵ�
     * @return HashMap �������м�ֵ�Ե�Map
     */
    public HashMap toHashMap(String strXPath)
    {
        HashMap mapRet = new HashMap();
        try
        {
            Element element = null;
            if (null == strXPath)
            {
                element = document.getRootElement();
            }
            else
            {
                XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
                element = (Element) xpath.selectSingleNode(document);
            }
            
            if (false == getElementValues(element, mapRet))
            {
                mapRet.clear();
                return null;
            }
        }
        catch (Exception e)
        {
            mapRet.clear();
            return null;
        }
        
        return mapRet;
    }
    
    /**
     * <p>˽�У��ݹ��ȡ�ڵ��µļ�ֵ�Ե������Map��</p>
     * <p>  �����ڵ�·��</p>
     * <p>  ������ͬ���ڵ�ʱ������ʧ�ܣ���ֹȡֵʧ��</p>
     * @param element �ڵ�
     * @return HashMap �������м�ֵ�Ե�Map
     */
    private boolean getElementValues(Element element, HashMap mapRet)
    {
        if (null == element)
        {
            return false;
        }
        
        try
        {
            List children = element.getChildren();
            if (null == children || children.size() <= 0)
            {
                // �����������ڵ�
                if (null == mapRet.get(element.getName()))
                {
                    mapRet.put(element.getName(), element.getText());
                    return true;
                }
                else
                {
                    return false;
                }
            }
            
            for (int nLoop = 0; nLoop < children.size(); nLoop ++)
            {
                if (false == getElementValues((Element)children.get(nLoop), mapRet))
                {
                    return false;
                }
            }
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
    
    /**
     * <p>���xml�ַ���</p>
     */
    public String toString()
    {
        XMLOutputter xmlOut = new XMLOutputter(Format.getPrettyFormat());
        return xmlOut.outputString(document);
    }

    /**
     * <p>����Document����</p>
     */
    public Document getDocument()
    {
        return this.document;
    }
    
    /**
	 * <p>ɾ��JDOM�ĵ������е�ĳ���ڵ�</p>
	 * @param doc Document JDOM�ĵ�����
	 * @param strXPath String �ڵ��·��
	 */
	public void deleteSingleNode(String strXPath)
	{
		try
		{
			XPath xpath = XPath.newInstance(Constant.XPATHSPLIT + strXPath);
			Element element = (Element) xpath.selectSingleNode(document);
			element.getParentElement().removeChild(element.getName());
		}
		catch (Exception e)
		{
		}
	}
	
	/**
	 * linux��ʹ��weblogic10.3.5 ������ ����xpath.selectNodes����ʱ����APP������ж������Ҳ��׳��쳣
	 * xpath.selectSingleNode������������ʹ�ã���ʱ�Ҳ������������ķ���
	 * ��˰Ѹù������е�����xpath.selectNodesӳ��Ϊxpath.selectSingleNode����ʵ��
	 * [Ϊ�����߲���Ϊ֮]
	 * bxs 2014/6/7
	 */
	public List getPathNodes(String strPath)
	{
		List list = null ;
		try
		{
			String[] paths = strPath.split("/");
        	String singleNodePath = "";
        	String arrNodePath = "";
        	for(int i = 0; i < paths.length ; i++)
        	{
        		if(i == paths.length -1)
        		{
        			arrNodePath = paths[i];
        			break;
        		}
        		singleNodePath += paths[i];
        		singleNodePath += "/";
        	}
        	 XPath xpat = XPath.newInstance(Constant.XPATHSPLIT+singleNodePath.substring(0,singleNodePath.length()-

1));
        	 Element elements = (Element)xpat.selectSingleNode(document);
        	 list = elements.getChildren(arrNodePath);
		}catch(Exception e)
		{
			list = null;
		}
		return list;
	}

    /**
     * <p>���Գ������</p>
     * 
     * @param args String[] ����
     */
    public static void main(String[] args) throws Exception
    {
        XmlParam xmlparam = new XmlParam();
       
        String xmlString= "<?xml version='1.0' encoding='UTF-8'?>"
        +"  <MessageHead>"
        +"     <ServiceName>updateCassUnitInfoCmd</ServiceName>"
        +"    <MessageType>UpdateCassUnitInfo</MessageType>"
        +"     <TermNum>603</TermNum>"
        +"     <MessageUniqueID>8</MessageUniqueID>"
        +"     <BranchNum>2212</BranchNum>"
        +"     <SubBranchNum>2212</SubBranchNum>"
        +"   </MessageHead>"
        +"   <Request>"
        +"    <CassUnitInfo>"
        +"       <Records>"
        +"        <Record>"
        +"          <UnitID>RJCAS</UnitID>"
        +"           <Type>�ϳ���</Type>"
        +"          <Currency>CNY</Currency>"
        +"          <Value>0</Value>"
        +"          <InitialCount>0</InitialCount>"
        +"           <Count>0</Count>"
        +"           <Status>����</Status>"
        +"           <CashTotal>0</CashTotal>"
        +"         </Record>"
        +"        <Record>"
        +"           <UnitID>CAS_A</UnitID>"
        +"           <Type>ȡ����</Type>"
        +"           <Currency>CNY</Currency>"
        +"          <Value>100</Value>"
        +"          <InitialCount>0</InitialCount>"
        +"          <Count>0</Count>"
        +"          <Status>����</Status>"
        +"           <CashTotal>0</CashTotal>"
        +"        </Record>"
        +"      </Records>"
        +"    </CassUnitInfo>"
        +"   </Request>"
        +" </xBankBass>";
        
        
        xmlparam.loadXML(xmlString);
        
        List list = xmlparam.getNodes("xBankBass/Request/CassUnitInfo/Records/Record");
        System.out.println(list);
        /*
        xmlparam.loadXML(xmlString);
        xmlparam.deleteSingleNode("xBankBass/p");
        System.out.println(xmlparam.toString());
        
        		xmlString+="<?xml version=\"1.0\"?

><Request><Records><Record><TransactionName>withdrawer</TransactionName><StartTime>2010-07-24 

10:00:00</StartTime><EndTime>2010-07-24 10:00:59</EndTime></Record>";
        		xmlString=xmlString + "<Record><TransactionName>withdrawer</TransactionName><StartTime>2010-07-25 

10:00:00</StartTime><EndTime>2010-07-24 10:00:59</EndTime></Record></Records></Request>";

        		
        		 System.out.println(xmlString);
        		 xmlparam.loadXML(xmlString);
       		
        		 List listRecords=xmlparam.getRecords("Request/Records/Record");//��ȡRecord
        		 for(Object hm:listRecords){
        			 HashMap hm2=(HashMap)hm;
        			 System.out.println(hm2.get("StartTime"));
        		 }
        		 */
//        xmlString="<xBankBass></xBankBass>";
//        xmlparam.loadXML(xmlString);
//        Element rep=xmlparam.appendNode("xBankBass/Response/TellerCase/Cash");
//       
//        xmlparam.setParamVal(rep,"name", "name1"); 
//        xmlparam.setParamVal(rep,"count", "count1"); 
//       
//        rep=xmlparam.appendNode("xBankBass/Response/TellerCase/Cash");
//        
//        xmlparam.setParamVal(rep,"name", "name2"); 
//        xmlparam.setParamVal(rep,"count", "count2"); 
        
        System.out.println(xmlparam.toString());
      
   		
    } 
   
}
