// Even From End

// https://www.hackerearth.com/problem/algorithm/even-from-end-1/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        while(s.hasNextInt())
        {
        	int l=s.nextInt();
        	int a[]=new int[l];
        	int m=0;
        	for(int i=0;i<l;i++)
        	{
        		int p=s.nextInt();
               if(p%2==0 && p!=0)
               {
        	a[m]=p;
        	m++;
               }
        	}
        	if(m!=0)
        	for(int i=m-1;i>=0;i--)
        	System.out.print(a[i]+" ");
        	else
        	System.out.print("None to display");

        System.out.println();
        }
    }
}
