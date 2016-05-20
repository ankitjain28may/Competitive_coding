// Algorithm Guru*

// https://www.hackerearth.com/problem/algorithm/algorithm-guru

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
	int n=s.nextInt();
	int sum=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=s.nextInt();
	t--;
        System.out.println(sum); 
}
    }
}