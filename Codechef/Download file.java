// Download file
// Problem code: DWNLD
// https://www.codechef.com/problems/DWNLD

import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0)
       {
            int n = 0, k = 0, sum = 0, check = 0;
            n = s.nextInt();
            k = s.nextInt();
            while(n != 0) {
                int Ti = s.nextInt();
                int Mb = s.nextInt();
                if (check + Ti <= k) {
                    check += Ti;
                } else {
                    Ti = Ti - (k - check);
                    check = k;
                    sum = sum + (Ti * Mb);
                }
                n--;
            }
            System.out.println(sum);
            t--;
       }
    }
}
