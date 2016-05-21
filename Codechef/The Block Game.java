// The Block Game
// Problem code: PALL01
// https://www.codechef.com/problems/PALL01

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0)
		{
			int n=s.nextInt();
			int a=n;
			int x=0;
			while(a!=0)
			{
				x=(x*10)+(a%10);
				a=a/10;
			}
			if(x==n)
				System.out.println("wins");
			else
				System.out.println("losses");
		}
	}
}