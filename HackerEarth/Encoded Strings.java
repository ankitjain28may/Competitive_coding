// Encoded Strings

// https://www.hackerearth.com/problem/algorithm/encoded-strings-3/

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
        String st=(s.next()).toUpperCase();
        int l=st.length();
        int sum=0,a=0;
        for(int i=0;i<l;i++)
        {
        	 a=(int)st.charAt(i);
        	a=a-64;
        	sum=sum*10+a;
        }
        if(sum%6==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
