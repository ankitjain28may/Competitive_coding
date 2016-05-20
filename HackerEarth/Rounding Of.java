
// https://www.hackerearth.com/code-mania-2c/algorithm/rounding-of/submissions/

import java.util.Scanner;
 
class TestClass {
    public static void main(String args[] ){      
    	Scanner s=new Scanner(System.in);                     
    	int n=s.nextInt();
    	while(n!=0) {                            
    		int a=s.nextInt();
    		int b=s.nextInt();
    		int q= a/b;
    		int r=a%b;
    		int ss= (q+1)*b -a;                                      
    		if(r<ss)
    System.out.println(q*b);     
    else
   System.out.println((q+1)*b);       
   n=n-1;
    	}
    }
}