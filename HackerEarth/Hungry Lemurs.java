 // # Hungry Lemurs*

 // # https://www.hackerearth.com/problem/algorithm/hungry-lemurs/

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
int a=s.nextInt();
int b=s.nextInt();  
int c=a%b;
int min=100000, m=1, x=0;
      int d=((a/b)+1)*b;
      int e= d-a; 
      if(c>=e)
      { int p=b;
      	while(a%b!=0)
      	{
      	b--;
      	c=((a/b)+1)*b-a;
      	x=c+m;
        m++;
        if(x<min)
        min=x;
        
      }
      b=p;
      m=1;
      while(a%b!=0)
      {
      	a++;
      	c=((a/b)+1)*b-a;
      	x=c+m;
      	m++;
      	if(x<min)
      	min=x;
      }
      }
      else
      {
      	int p=b;
      	while(a%b!=0)
      	{
      		b++;
      		c=a%b;
      		x=c+m;
      		m++;
      		if(x<min)
      		min=x;
      	}
      	b=p;
      	m=1;
      	while(a%b!=0)
      	{
      		a--;
      		c=a%b;
      		x=c+m;
      		m++;
      		if(x<min)
      		min=x;
      	}
      }
       System.out.println(min);
    }
}