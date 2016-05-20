 // Alupuri Treat

 // https://www.hackerearth.com/problem/algorithm/alupuri-treat/


import java.util.*;
class test
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int p=0,r=0;
for(int k=0;k<m;k++)
	{
	int a[]=new int[m];
	for(int i=0;i<m;i++)
	a[i]=s.nextInt();
    p=p+a[k];
    r=r+a[m-k-1];
	}
int x=0;
if(p>=r)
x=p-r;
else
x=r-p;
    System.out.println(x);
	}
}