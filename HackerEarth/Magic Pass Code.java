// Magic Pass Code

// https://www.hackerearth.com/problem/algorithm/magic-pass-code-1/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        int max=0,x=0;
        while(s.hasNextInt())
        {
        	int sum=0;
        	int n=s.nextInt();
        	int a=n;
        	while(n!=0)
        	{
        		int r=n%10;
        		n=n/10;
        		sum=sum+r;
        	}
        	if(sum>max)
        	{
        	max=sum;
        	x=a;
        	}
        }
        System.out.println(x);
    }
}
