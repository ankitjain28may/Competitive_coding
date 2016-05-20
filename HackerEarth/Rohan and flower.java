 // Rohan and flower*

 // https://www.hackerearth.com/problem/algorithm/rohan-and-flower/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int h=s.nextInt();
    int a[]=new int[l];
    for(int i=0;i<l;i++)
    a[i]=s.nextInt();
    int c=0;
   for(int i=0;i<l-2;i++)
   {
	for(int j=i+1;j<l-1;j++)
	{
		for(int k=j+1;k<l;k++)
		{
			  int p=a[i]*a[j]*a[k];
				if(p%h==0)
					c=c+1;
		}
	}
   }
        System.out.println(c);
    }
}
