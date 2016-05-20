// Maximum Resistance

// https://www.hackerearth.com/problem/algorithm/maximum-resistance-8/

import java.util.*;

class Tests {
    public static void main(String args[] ){      
    Scanner s=new Scanner(System.in);                     
    int n=s.nextInt();
while(n!=0)
{
String ss=s.next();
int l=ss.length();
int c=0;
for(int i=0; i<l; i++)
{
char ch=ss.charAt(i);
if(ch=='X')
c++;
}
int a[] = new int[c];
for(int i=0; i<c; i++)
a[i]=s.nextInt();
int max=a[c-1];
for(int i=l-1; i>=0; i--)
{
char ch=ss.charAt(i);
if(ch=='A')
{
max=max+a[c-2];
c--;
}
else if(ch=='B')
{
if(max<a[c-2])
max=a[c-2];
c--;
}
}
System.out.println(max);
n--;
}
}
}