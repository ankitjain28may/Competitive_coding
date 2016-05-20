// SKIT's Patties

// https://www.hackerearth.com/problem/algorithm/skits-patties-3/


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
 
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int flag=0;
	long a=s.nextLong();
	for(int i=0;i<a/6;i++)
	{
		for(int j=0;j<a/9;j++)
		{
			for(int k=0;k<a/20;k++)
			{
				long x=6*i+9*j+20*k;
				if(x==a)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			break;
			
		}
		if(flag==1)
		break;
	} 
	if(flag==1)
        System.out.println("True");
        else
        System.out.println("False");
        n--;
}
    }
}
