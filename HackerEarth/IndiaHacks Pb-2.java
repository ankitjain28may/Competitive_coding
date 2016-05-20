// IndiaHacks Pb-2

// https://www.hackerearth.com/problem/algorithm/box-n-ball-1/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*; 
import java.text.*;
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
while(n!=0)
{
	long a=s.nextLong();
	long b=s.nextLong();
	long c=s.nextLong();
	double min=a;
	if((a<=b) &&(a<=c))
	min=a;
	else if((b<=a)&&(b<=c))
	min=b;
	else
	min=c;    
	DecimalFormat df=new DecimalFormat("#0.0");
String r=df.format(min/2);
        System.out.println(r);
        n--;
}
    }
}
