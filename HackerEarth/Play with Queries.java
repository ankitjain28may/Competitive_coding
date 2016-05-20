// Play with Queries

// https://www.hackerearth.com/problem/algorithm/play-with-queries/


import java.util.*;
class TestClass {
    public static void main(String args[] )  {
      
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
while(r!=0)
{     
	int c=0;
	int t=s.nextInt();
	int k=s.nextInt();
	if(t==1)
	{
		for(int i=1;i<=n;i++)            
        {  
        	if((n%i==0) && (k%i==0))
        	c++;
        }
	}
	else if(t==2)
	{
		for(int i=1;i<=n;i++)
		{
			if((n%i==0) && (i%k==0))
			c++;
		}
	}
	else
	{
		for(int i=1;i<=n;i++)
		{
			if((n%i==0) && (i%k!=0))
			c++;
		}
	}
		
        System.out.println(c);
        r--;
    }
}
}