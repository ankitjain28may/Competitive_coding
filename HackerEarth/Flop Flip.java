// Flop Flip

// https://www.hackerearth.com/problem/algorithm/flip-flop-6/


import java.util.*;  
import java.io.*;
class TestClass {
    public static void main(String args[] )throws IOException {
      
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
   int c=0,j=0,t=0;
   char chx;
	String ss=s.next();
 int l=ss.length();
	for(int i=0;i<l-1;i++)
	{       
		char ch=ss.charAt(i);          
		if(ch=='X')
		{
		 chx='X';
			}
		else 
		chx='Y';
			for( t=i+1;t<l;t++)
			{
				if(ss.charAt(t)==chx)
				c++;
				else
				{       
					i=i+(t-i)-1;
				break;
			}
			break;
			}
		}

        System.out.println(c);
        n--;
}

    }
}
