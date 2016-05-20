// Breaking Bad

// https://www.hackerearth.com/problem/algorithm/breaking-bad-3/


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
        			if(a[i]<a[j])
        			{
        				int x=a[i];
        				a[i]=a[j];
        				a[j]=x;
        			}
        		}
        	}
        	int sum=0;
        	for(int i=0;i<l;i=i+2)
        	sum=sum+(a[i]*a[i+1]);
        t--;
        System.out.println(sum);
        }
    }
}