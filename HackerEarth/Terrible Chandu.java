// Terrible Chandu

// https://www.hackerearth.com/problem/algorithm/terrible-chandu/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class TestClass {
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in); 
		
		int t=s.nextInt();
		while(t!=0)
		{                                    
			String ss=s.next();
			int l=ss.length();
			for(int i=l-1;i>=0;i--)
			{
				System.out.print(ss.charAt(i));
			}
			System.out.println();
			t--;
		}
	}
}