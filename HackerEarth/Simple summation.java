// Simple summation

// https://www.hackerearth.com/problem/algorithm/simple-summation/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
        	int n=s.nextInt();
        	int k=s.nextInt();
        	int q=n/k;
        	int r=n%k;
        	int sum=0;
            sum=(k*(k-1))/2;
        	sum=sum*q;
        	sum=sum+(r*(r+1)/2);
            t--;
        System.out.println(sum);
        }
    }
}