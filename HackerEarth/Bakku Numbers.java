// Bakku Numbers*

// https://www.hackerearth.com/problem/algorithm/bakku-numbers/


import java.util.*;
import java.text.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int t=s.nextInt();
        while(t!=0)
        {
        	double c=0;
        	int i=s.nextInt();
        	int l=s.nextInt();
        	int x=l-i+1;
        	for(;i<=l;i++)
        	{
        		if(i%a==0 || i%b==0)
        		c++;
        	}
        	DecimalFormat df=new DecimalFormat("#0.000000");
            String st=df.format(c/x);
        System.out.println(st);
        t--;
        }
    }
}
