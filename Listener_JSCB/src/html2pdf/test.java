package html2pdf;

import java.io.PrintStream;

public class test {	  
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        /* ���÷���1*/
	        method1(a,b); //Ҫ���ڷ���1������֮���ӡ��a=100 b=200 ��д��method1�Ĵ���
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
