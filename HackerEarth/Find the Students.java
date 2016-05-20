// Find the Students

// https://www.hackerearth.com/problem/algorithm/find-the-students-7/

import java.util.*;

class TestClass {
    public static void main(String args[] ){      
    Scanner s=new Scanner(System.in);                     
    int n=s.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int r=n;
while(r!=0)
{
System.out.println(r);
int min=1000,x=0;
for(int i=0;i<n;i++)
if(min>a[i] && a[i]>0)
min=a[i];
for(int i=0;i<n;i++)
{
if(a[i]==min)
{
a[i]=0;
x++;                                
}          
}
r=r-x;
}
}
}