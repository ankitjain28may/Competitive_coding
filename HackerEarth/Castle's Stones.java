// Castle's Stones

// https://www.hackerearth.com/problem/algorithm/castles-stones-1/


import java.util.*;
class TestClss {
    public static void main(String args[] ) {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int c=0,t=0;
	int max=s.nextInt();
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
		    t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		}
	}
	for(int i=0;i<l;i++)
	{ 
		int p=0,b=0;
	   for(int j=l-1;j>=i;j--)
	   {
		if((a[i]+a[j]<=max) && a[i]!=0 && a[j]!=0)
		{ 
			if(a[j]>p)
			{
				p=a[j];
				 b=j;
			}
		}
	   }
	   if(p!=0)
	   {
			c++;
			a[i]=0;
			a[b]=0;     
		}
	   else if(a[i]!=0 && a[i]<=max)
		c++;
	}
        System.out.println(c);
        n--;
}
    }
}
