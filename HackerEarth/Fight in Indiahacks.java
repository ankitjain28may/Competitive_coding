// Fight in Indiahacks

// https://www.hackerearth.com/problem/algorithm/fight-in-indiahacks/

import java.util.*;

class TestClass {
    public static void main(String args[] ){      
    Scanner s=new Scanner(System.in);                     
    int n=s.nextInt();
while(n!=0)
{
int a= s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int x=1;
while(a>=0)
{
if(x%2==0)
{
if(a>=c)
a=a-c;
else
{
a=a-c;
System.out.println("1");
}
}
else
{
if(a>=b)
a=a-b;
else
{
a=a-b;
System.out.println("0");
}
}
x=x+1;
}
n--;
}
}
}