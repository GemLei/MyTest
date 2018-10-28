package html2pdf;

import java.io.PrintStream;

public class test {	  
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        /* 调用方法1*/
	        method1(a,b); //要求在方法1被调用之后打印出a=100 b=200 请写出method1的代码
	        System.out.println("a="+a);
	        System.out.println("b="+b);
	    }
	  public static void   method1(int a, int b){
//		  System.out.println("a="+a*10);
//		  System.out.println("b="+b*10);
//		  System.exit(0);
		  PrintStream ps =new PrintStream(System.out){
			  @Override
			  public void println(String x){
				  if(x.startsWith("a")){
					  	super.println("a=" + 100);
				  }
				  if(x.startsWith("b")){
					  super.println("b=" + 200);
			  		}
			  	}
			  };
			  System.setOut(ps);
		  }
}
