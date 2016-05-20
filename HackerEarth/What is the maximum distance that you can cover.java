 // What is the maximum distance that you can cover?*

 // https://www.hackerearth.com/problem/algorithm/what-is-the-maximum-distance-that-you-can-cover-505/

import java.util.*; 
import java.text.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<n;i++)
b[i]=s.nextInt();
double p=s.nextDouble();
int max=0;
String petrol="";
for(int i=0;i<n;i++)
{
	int x=(int)((a[i]*p)/b[i]);
	if(max<x)
	{ 
		max=x;
	String st=Integer.toString(x);
	int l=st.length();
	st="#";
	for(int j=0;j<l;j++)
	st=st+"0";
	st=st+".0000";
	DecimalFormat df=new DecimalFormat(st);
	String sp=df.format((a[i]*p)/b[i]);
	petrol=sp.substring(0,sp.length()-1);
	}
	
}
        System.out.println(petrol);
        
    }
}