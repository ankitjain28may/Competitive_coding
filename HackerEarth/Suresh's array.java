// Suresh's array

// https://www.hackerearth.com/problem/algorithm/sureshs-array-3/


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
            		if(a[j]<a[i])
            		{
            			int p=a[i];
            			a[i]=a[j];
            			a[j]=p;
            		}
            	}
            }
            for(int i=0;i<l/2;i+=1)
{
	System.out.print(a[i]+" ");
	System.out.print(a[l-i-1]+" ");
}
if(l%2!=0)
System.out.print(a[(l/2)]);
System.out.println();
         t--;
        }
    }
}
