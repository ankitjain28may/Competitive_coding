// Find Prime numbers in a range
// http://www.practice.geeksforgeeks.org/problem-page.php?pid=374

// Java program to find prime number greater than a
// given number using built in method

import java.util.*;
import java.math.*;
 
class NextPrimeTest
{
    // Function to get nextPrimeNumber
    static long nextPrime(long n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }
 
    // Driver method
    public static void main (String[] args)
                    throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
            long st=s.nextLong();
            long en=s.nextLong();
            for(long i=st-1;i<=en;)
            {
                i=nextPrime(i);
                if(i<=en)
                    System.out.print(i+" ");
            }
            t--;
            System.out.println();
        }
    }
}