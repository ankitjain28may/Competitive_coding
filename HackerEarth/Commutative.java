// Commutative

// https://www.hackerearth.com/problem/algorithm/commutative/


import java.util.*;
class TestClass {
    public static void main(String args[] ) {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{ int c=0;
	int p=s.nextInt();
	int l=p*(p-1);
	for(int i=1;i<=l;i++)
	{
		for(int j=1;j<=l;j++)
		{
			double nm=Math.pow(j,i);
			double mn=Math.pow(i,j);
		    double d=nm-mn;
			if(d%p==0)
				c++;
			
		}
	}
        System.out.println(c);
        n--;
}
    }
}
