// *Code GJ'd

// https://www.hackerearth.com/problem/algorithm/code-gjd/


import java.util.*;
class TestClass {
public static void main(String args[] ) throws Exception {
   
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int sum=0,max=0;
	int l=s.nextInt();
	int a[]=new int [l];
	for(int i=0;i<l;i++)
	a[i]=s.nextInt();
	for(int i=0;i<l-1;i++)
	{
		for(int j=i+1;j<l;j++)
		{
			if(a[i]<a[j])
			{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			}
		}
	}
	sum=a[0];
	for(int i=1;i<l;i++)
	{
		sum=sum+a[i];
		max=max+sum;
	}

        System.out.println(max);
        n--;
}
    }
}
