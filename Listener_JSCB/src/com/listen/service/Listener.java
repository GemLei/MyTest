package com.listen.service;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.io.File;
import java.io.PrintStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
public class Listener extends HttpServlet {

    public Listener() {
    }

    public void init() throws ServletException {
        super.init();
        System.out.println("\u521D\u59CB\u5316WebServerUtil\u7C7B");
        initParam();
        main();
    }

    public void initParam() {
        StringBuffer path = new StringBuffer(512);
        String strPath = getServletContext().getRealPath(File.separator).toString();
        path.append(strPath);
        strContext = strPath;
        path.append(File.separator);
        path.append("WEB-INF");
        path.append(File.separator);
        path.append("classes");
        strClassPath = path.toString();
    }

    public static String getClassPath() {
        return strClassPath;
    }

    public static String getContext() {
        return strContext;
    }

    public static String strClassPath = null;
    public static String strContext = null;



	/**
	 * @param args
	 */
	public static void main() {
		try {
			ServerSocket ss = new ServerSocket(40002,5000);
			while(true) {
				TestServerSocketToo mu = new TestServerSocketToo(ss.accept());
		        mu.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
        try {
            
            ServerSocket ss = new ServerSocket(40002,5000);
            while(true) {
                TestServerSocketToo mu = new TestServerSocketToo(ss.accept());
                mu.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
