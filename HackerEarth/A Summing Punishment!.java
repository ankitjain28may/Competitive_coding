// A Summing Punishment!

// https://www.hackerearth.com/problem/algorithm/a-summing-punishment-6/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int q=s.nextInt();
while(q!=0)
{
	int l=s.nextInt();
	int r=s.nextInt();
	int sum=0;
	l=l-1;
	r=r-1;
	for(int i=l;i<=r;i++) 
sum=sum+a[i];
        System.out.println(sum);  
        q--;
}
    }
}
