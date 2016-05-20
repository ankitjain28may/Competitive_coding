// Scoring in Exam*

// https://www.hackerearth.com/problem/algorithm/scoring-in-exam-1/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int q=s.nextInt();
long a[]=new long[n];
long b[]=new long[n];
for(int i=0;i<n;i++)
a[i]=s.nextLong();
for(int i=0;i<n;i++)
b[i]=s.nextLong();
for(int i=0;i<n-1;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]<a[j])
		{
			long t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
}
while(q!=0)
{
	int k=s.nextInt();
	long sum=0;
	for(int i=0;i<k;i++)
	sum=sum+a[i];
	System.out.println(sum);
	q--;
}
        
    }
}
