// Lucky Four
// Problem code: LUCKFOUR
// https://www.codechef.com/problems/LUCKFOUR


import java.io.*;
class Main
{
public static void main(String arg[])throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t!=0)
    {
        int c=0;
        String s=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='4')
            c++;
            
        }
        System.out.println(c);
        t--;
    }
}
} 