// IndiaHacks and Ola Cabs

// https://www.hackerearth.com/problem/algorithm/indiahacks-and-ola-cabs/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) {
        
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0,c=0;
while(n!=0)
{
	 sum=0;
	 c=0;
	int a=s.nextInt();
	int p[]=new int[a];
	for(int i=0; i<a; i++)
    p[i]=s.nextInt();
   for(int i=0; i<a; i++)
     sum=sum+p[i];
	if(sum%4!=0)
	c=(sum/4)+1;
	else
	c=sum/4;
	System.out.println(c);
	n--;
}

        
    }
}
