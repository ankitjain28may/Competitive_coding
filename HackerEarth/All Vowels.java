 // All Vowels

 // https://www.hackerearth.com/problem/algorithm/all-vowels-2/


import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
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
