// Kejal Color Problem

// https://www.hackerearth.com/problem/algorithm/kejal-color-problem/


import java.util.*;
class TestClass {
    public static void main(String args[] )  {
  
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]= new int[n];                         
int c=1;
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<n-1;i++)
{
	if(a[i]!=a[i+1])
	c++;
}
        System.out.println(c);
    }
}
