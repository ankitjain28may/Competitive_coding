 // String length

 // https://www.hackerearth.com/problem/algorithm/string-length-117/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
	String st=s.next();
	int l=st.length();
    System.out.println(l);
   n--;
}
}
}
