// Deadpool and his valentine*

// https://www.hackerearth.com/problem/algorithm/deadpool-and-his-valentine-3/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[m];
        int flag=0;
        for(int i=0;i<k;i++)
        {
        while(s.hasNextInt())
        {
        	int t=s.nextInt();
        	t=t-1;
        	a[t]=1;
        	}
        }
        for(int i=0;i<m;i++)
        {
        	if(a[i]!=1)
        	{
        		System.out.println("NO");
        		flag=1;
        		break;
        	}
        }
        if(flag==0)
        System.out.println("YES");
    }
}
