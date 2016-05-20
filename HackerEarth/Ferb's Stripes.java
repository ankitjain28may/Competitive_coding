// Ferb's Stripes

// https://www.hackerearth.com/problem/algorithm/ferbs-stripes-1/


import java.util.*;
class TestClass {
    public static void main(String args[] ) {
    
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {             int flag=0;
        	int l=s.nextInt();
        	int a[]=new int[l];
        	for(int i=0;i<l;i++)
        	a[i]=s.nextInt();
        	for(int i=0;i<l-1;i++)
        	if(a[i]==a[i+1])
        	{
        		flag=1;
        		break;
        	}    
        	if(flag==1)
        	System.out.println("bad luck");
        	else
        	System.out.println("can do");
        	n--;
        }
        
    }
}
