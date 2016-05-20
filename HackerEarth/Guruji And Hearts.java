 // Guruji And Hearts

 // https://www.hackerearth.com/problem/algorithm/guruji-and-hearts-2/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        int l=t.length();
        int c=0;
        for(int i=0;i<l-1;i++)
        {
        	if(t.substring(i,i+2).equals("<3"))
        	c++;
        }
        System.out.println(c);
    }
}
