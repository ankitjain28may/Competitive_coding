// Sum of Digits
// Problem code: FLOW006
// https://www.codechef.com/problems/FLOW006


import java.io.*;
class Main
{
public static void main(String arg[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t!=0)
{
int n=Integer.parseInt(br.readLine());
int c=0,s=0;
while(n!=0)
{
    c= n%10;
    s=s+c;
    n=n/10;
}
System.out.println(s);
t--;
}
}
}