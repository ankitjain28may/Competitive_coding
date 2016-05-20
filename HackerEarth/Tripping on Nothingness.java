// Tripping on Nothingness

// https://www.hackerearth.com/problem/algorithm/tripping-on-nothingness/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int q=s.nextInt();
int a[]=new int[q];
for(int i=0;i<q;i++)
a[i]=s.nextInt();
int b[]=new int[q];
for(int i=0;i<q;i++)
b[i]=0;
int m=0;
for(int i=0;i<q;i++)
{ int flag=0,li=n;
	if(a[i]<n)
		li=a[i];
		for(int j=li;j>=1;j--)
		{
			if(a[i]%j==0 && n%j==0)
			{
				for(int k=0;k<q;k++)
				{
					if(j==b[k])
					{
						b[m]=-1;
						flag=1;
						m++;
						break;
							
					}
				}
				if(flag!=1)
				{
				b[m]=j;
				m++;
				}
				break;
			}
		}
}
for(int i=0;i<q;i++)
        System.out.println(b[i]);
    }
}
