// Average sequence

// https://www.hackerearth.com/problem/algorithm/average-sequence-4/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
Scanner s=new Scanner(System.in);
int l=s.nextInt();
long a[]=new long[l];
for(int i=0;i<l;i++)
a[i]=s.nextLong();
long sum=0;
long b=0;
for(int i=0;i<l; i++)
{
b=((i+1)*a[i])-sum; 
System.out.print(b + " ");
sum=sum+b;  
}
    }
}
