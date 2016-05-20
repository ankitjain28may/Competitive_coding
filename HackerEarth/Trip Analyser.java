// Trip Analyser

// https://www.hackerearth.com/problem/approximate/trip-analyser/


import java.util.*;
import java.text.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
	DecimalFormat df=new DecimalFormat("#0.0000000000");
	double a=s.nextDouble();
	double b=s.nextDouble();
	String d="";
	if(a<b)
	{
		d=df.format(0);
		System.out.println(d);
	}
	else
	{
	   double c=a-b;
	   c=c+(b/4);
			 d=df.format(c);
		
		System.out.println(d);
	}
	n--;
}
        
    }
}
