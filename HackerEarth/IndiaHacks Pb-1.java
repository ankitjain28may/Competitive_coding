// IndiaHacks Pb-1

// https://www.hackerearth.com/problem/algorithm/game-of-thornes-2/

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
String st=s.next();
int l=st.length();
char a[]=new char[l];
for(int i=0;i<l;i++)
a[i]=st.charAt(i);
int c[]=new int[l];
for(int t=0;t<l;t++)
c[t]=1;
int p=0,flag=0,x=0;
for(int i=0;i<l-1;i++)
{
	for(int j=i+1;j<l;j++)
	{
		if(a[i]==a[j])
		{
			for(int k=j;k<l-1;k++)
			{
				a[k]=a[k+1];
			} 
			l--;
			c[p]=c[p]+1;
			
		j--;
		}
	}
	p++;
} 
for(int i=0;i<l;i++)
{
	if(c[i]%2!=0)
	{
		x++;
	}
}
   if((flag==0 && x==0) || (flag==0 && x==1))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
