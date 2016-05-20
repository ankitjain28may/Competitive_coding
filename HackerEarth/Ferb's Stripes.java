// Ferb's Stripes

// https://www.hackerearth.com/problem/algorithm/ferbs-stripes-1/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {             int flag=0;
        	int l=s.nextInt();
        	int a[]=new int[l];
        	for(int i=0;i<l;i++)
        	a[i]=s.nextInt();
        	for(int i=0;i<l-1;i++)
        	if(a[i]==a[i+1])
        	{
        		flag=1;
        		break;
        	}    
        	if(flag==1)
        	System.out.println("bad luck");
        	else
        	System.out.println("can do");
        	n--;
        }
        
    }
}
