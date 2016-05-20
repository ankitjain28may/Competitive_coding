// Will you be my friend?

// https://www.hackerearth.com/problem/algorithm/will-you-be-my-friend-pledge-easy/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
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
