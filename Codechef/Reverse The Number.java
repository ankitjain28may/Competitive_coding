// Reverse The Number
// Problem code: FLOW007
// https://www.codechef.com/problems/FLOW007


import java.io.*;
    class reverse
    {
    public static void main(String arg[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
 
    int n;
    while(t!=0)
    {
    n=Integer.parseInt(br.readLine());
       int s=0,a=0;
    while(n!=0)
    {
    a=n%10;
    s=(s*10)+a;
    n=n/10;
    }
    System.out.println(s);
    t--;
    }
    }
    } 