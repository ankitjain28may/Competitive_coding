// Game of multiples

// https://www.hackerearth.com/problem/algorithm/multiples/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner ss=new Scanner(System.in);
        long t=ss.nextLong();
        while(t!=0)
        {
        	long n=ss.nextLong();
        	n=n-1;
        	long th=n/3;
        	long fi=n/5;
        	long fif=n/15;
        	long s=0;
    s=(th*(6+(th-1)*3))/2;
	s=s+(fi*(10+(fi-1)*5))/2;
	s=s-(fif*(30+(fif-1)*15))/2;
        System.out.println(s);
        t--;
        }
    }
}