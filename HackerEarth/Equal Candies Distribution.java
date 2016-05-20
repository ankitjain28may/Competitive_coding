// Equal Candies Distribution*

// https://www.hackerearth.com/problem/algorithm/equal-candies-distribution-3/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
	int l=s.nextInt();
	int a[]=new int[l];
	for(int i=0;i<l;i++)
	a[i]=s.nextInt();
	for(int i=0;i<l-1;i++)
	{
		for(int j=i+1;j<l;j++)
		{
			if(a[i]>a[j])
			{
			int r=a[i];
			a[i]=a[j];
			a[j]=r;
			}
		}
	}
	int c=0;
	for(int i=l-1;i>1;i--)
	{
	int p=a[i]-a[i-1];
	if(p==1)
	{
		for(int j=i-1;j>0;j--)
		{
			a[j]=a[j]+1;
		}
		c++;
	}
	else if(p==2)
	{
		for(int j=i-1;j>0;j--)
		{
			a[j]=a[j]+2;
		}
		c++;
	}
	else if(p==5)
	{
		for(int j=i-1;j>0;j--)
		{
			a[j]=a[j]+5;
		}
		c++;
	}
	}
     t--;
        System.out.println(c);
	}
    }
}