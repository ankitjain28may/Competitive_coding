 // Cormen Boy and ACM ICPC*

 // https://www.hackerearth.com/problem/algorithm/cormen-boy-and-acm-icpc/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int p=0;
        if(n%2==0)
         p=n/2;
         else
         p=(n+1)/2;
        int max=0;
        while(t!=0)
        {
        	int sum=0;
        	int a[]=new int[n];
        	for(int i=0;i<n;i++)
        	a[i]=s.nextInt();
        	for(int i=0;i<n-1;i++)
        	{
        		for(int j=i+1;j<n;j++)
        		{
        			if(a[i]<a[j])
        		{
        			int r=a[i];
        			a[i]=a[j];
        			a[j]=r;
        		}
        		}
        	}
        	for(int i=0;i<p;i++)
        	sum=sum+a[i];
        	if(sum>max)
        	max=sum;
        	t--;
        }
        System.out.println(max);
    }
}
