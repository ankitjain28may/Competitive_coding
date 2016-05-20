// Average sequence

// https://www.hackerearth.com/problem/algorithm/average-sequence-4/

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
int l=s.nextInt();
long a[]=new long[l];
for(int i=0;i<l;i++)
a[i]=s.nextLong();
long sum=0;
long b=0;
for(int i=0;i<l; i++)
{
b=((i+1)*a[i])-sum; 
System.out.print(b + " ");
sum=sum+b;  
}
    }
}
