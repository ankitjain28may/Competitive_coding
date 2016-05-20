// IT solves Maths

// https://www.hackerearth.com/problem/algorithm/game-of-numbers-16/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	int c=0;
        	int n=s.nextInt();
        	for(int i=1;i<n;i++)
        	{
        		for(int j=i+1;j<=n;j++)
        		{
        			if((i*j)%(i+j)==0)
        			c++;
        		}
        	}
        System.out.println(c);
        t--;
    }
    }
}
