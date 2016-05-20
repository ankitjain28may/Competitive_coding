// Flop Flip

// https://www.hackerearth.com/problem/algorithm/flip-flop-6/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;  
import java.io.*;
class TestClass {
    public static void main(String args[] )throws IOException {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
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
