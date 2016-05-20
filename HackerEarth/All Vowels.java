 // All Vowels

 // https://www.hackerearth.com/problem/algorithm/all-vowels-2/

 /* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
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
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int l=Integer.parseInt(br.readLine());
String s=br.readLine();  
int flag=0;
for(int i=0;i<l;i++)
{
	char ch=s.charAt(i);
	if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u')
	{
		flag=1;
		break;
	}
}  
if(flag==1)
        System.out.println("NO"); 
        else
        System.out.println("YES");
    }
}
