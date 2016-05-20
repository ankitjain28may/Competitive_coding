// Will you be my friend?

// https://www.hackerearth.com/problem/algorithm/will-you-be-my-friend-pledge-easy/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
   
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int l=s.nextInt();
int a[]=new int[l];
for(int i=0;i<l;i++)
a[i]=s.nextInt();
int c=0;
for(int i=0;i<l;i++)
{ 
	int p=a[i],f=n;
	if(n<p)
	{
	p=n;
	f=a[i];
	}
	for(int j=2;j<=p;j++)
	{
		if(p%j==0 && f%j==0)
		{
			c++;
			break;
		}
	}
}
        System.out.println(c);
    }
}
