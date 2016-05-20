// Felicity Bind's

// https://www.hackerearth.com/problem/algorithm/felicity-binds/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
	int l=s.nextInt();
	int m[]=new int[l];
	int f[]=new int[l];
	for(int i=0;i<l;i++)
	m[i]=s.nextInt();
	for(int i=0;i<l;i++)
	f[i]=s.nextInt();
	int sum=0;
	for(int i=0;i<l-1;i++)
{
	for(int j=i+1;j<l;j++)
	{
		if(m[i]>m[j])
		{
			int t=m[i];
			m[i]=m[j];
			m[j]=t;
		} 
		if(f[i]>f[j])
		{
			int t=f[i];
			f[i]=f[j];
			f[j]=t;
		}
	}
}
for(int i=0;i<l;i++)
sum=sum+m[i]*f[i];
        System.out.println(sum);
        n--;
}
    }
}
