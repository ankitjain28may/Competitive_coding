// Bear and Bowling 3

// https://www.hackerearth.com/problem/algorithm/bear-and-bowling-3/

import java.util.*;
class test
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i;j++)
{
int p=i;
while(p>=0)
{
sum=sum+(a[p+j]*(p+1));
p--;
}
}
if(i>0)
for(int j=i+1;j<n-i;j++)
{
sum=sum+a[i];
sum=sum+(a[j+i]*(i+1));
}
}
System.out.println(sum);
}
}


