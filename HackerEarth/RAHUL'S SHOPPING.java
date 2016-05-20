// RAHUL'S SHOPPING

// https://www.hackerearth.com/problem/algorithm/rahuls-shopping/

import java.util.*;
class TestClass {
    public static void main(String args[] ) {
    
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=s.nextInt();
      int l=s.nextInt();
      int b=s.nextInt();                                               
      double dis=0;
      double fin=0;                                   
      int pe=0;
      for(int i=0;i<n;i++)
      {
      	double sum=a[i]/10+a[i]%10;
      	double ss=a[i]*sum;
      	ss=ss*l*b;
      	if(a[i]<=10)
      	dis=ss*0.25;
      	else if(a[i]>=11 && a[i]<=20)
      	dis=ss*0.30;
      	else
      	dis=ss*0.20;       
       double ma=Math.round(dis);
      	ss=ss-ma;
      	fin=fin+ss; 
      }
      
        System.out.println((int)fin);
    }
}
