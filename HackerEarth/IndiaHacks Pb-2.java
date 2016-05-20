// IndiaHacks Pb-2

// https://www.hackerearth.com/problem/algorithm/box-n-ball-1/

/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*; 
import java.text.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
	long a=s.nextLong();
	long b=s.nextLong();
	long c=s.nextLong();
	double min=a;
	if((a<=b) &&(a<=c))
	min=a;
	else if((b<=a)&&(b<=c))
	min=b;
	else
	min=c;    
	DecimalFormat df=new DecimalFormat("#0.0");
String r=df.format(min/2);
        System.out.println(r);
        n--;
}
    }
}
