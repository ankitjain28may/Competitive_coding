// Happy Birthday

// https://www.hackerearth.com/problem/algorithm/happy-birthday/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

import java.util.*;

class TestClass {
    public static void main(String args[] ){      
    Scanner s=new Scanner(System.in);                     
    int n=s.nextInt();
int sum[]=new int[n];
int ss=0, c=0;
    for(int i=0; i<n; i++)
{
    sum[i]=s.nextInt();
  }
for(int i=0; i<n; i++)
{
    ss=ss+sum[i];
  }
if(ss%4!=0)
{
c= (ss/4)+1;
}
else
{
c=ss/4;
}
System.out.println(c);
}
}