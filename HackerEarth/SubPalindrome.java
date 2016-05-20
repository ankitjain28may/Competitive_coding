// SubPalindrome

// https://www.hackerearth.com/code-mania-2c/algorithm/subpalindrome-3/


import java.util.Scanner;
import java.io.*;

class TestClass {
    public static void main(String args[] )throws IOException {      
    Scanner s=new Scanner(System.in);                     
    int n=s.nextInt();
    while(n!=0) {                            
    String st = s.nextLine();
    int l=st.length();
String ar = new String[l];
for(int p=0; p<l; p++)
{
ar[p]="";                      
}
char ch, ch1;
int t,a,b,flag=1,c=0;
for(int i=0; i<l; i++)
{
ch= st.charAt(i);
for(int j=l-1; j>i; j--)
{ 
flag=1;
ch1=st.charAt(j);
if(ch==ch1)
{
t=(j-i)/2;
a=i;
b=j;
while(t!=0)
{
ch=st.charAt(a++);
ch1=st.charAt(b--);
if(ch!=ch1)
{
flag=0;
break;
}
}
for(int k=0; k<l; k++)
{
if(st.substring(i,j+1).equals(ar[k])==true)
{
flag=0;
break;
}
}
if(flag==1)
{
ar[c]=st.substring(i,j+1);
c++;
}
}
}  
}
System.out.println(c+l);
n--;
}
}
}