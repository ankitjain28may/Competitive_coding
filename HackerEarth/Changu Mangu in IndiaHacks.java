// Changu Mangu in IndiaHacks

// https://www.hackerearth.com/problem/algorithm/changu-mangu-in-indiahacks/


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class Tests {
    public static void main(String args[] ) {
      
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	int sum=0;
        	int n=s.nextInt();
        	int m=s.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++)
        	a[i]=s.nextInt();
        		for(int i=0;i<n;i++)
        		sum=sum+a[i];
        		sum=sum+(10*(n-1));
        		if(sum<=m)
        		{
        		int sing=m-sum;
        		sing =sing+(10*(n-1));
        		System.out.println(sing/5);
        		}
        		
        		else
        		System.out.println(-1);
        		t--;
        }
        
    }
}
