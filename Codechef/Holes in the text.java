// Holes in the text
// Problem code: HOLES
// https://www.codechef.com/problems/HOLES


import java.io.*;
class Main
{
public static void main(String arg[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t!=0)
{
String n=br.readLine();
int l=n.length();
int c=0;
for(int i=0;i<l;i++)
{
char ch=n.charAt(i);
if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' || ch=='R')
c++;
else if(ch=='B')
c=c+2;
}
System.out.println(c);
t--;
}
}
} 