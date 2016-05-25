// Print Elements of Array
// http://www.practice.geeksforgeeks.org/problem-page.php?pid=276

import java.io.*;
class test
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t!=0)
		{
			int l=Integer.parseInt(br.readLine());
			String s=br.readLine();
			System.out.println(s);
			t--;
		}
	}
}