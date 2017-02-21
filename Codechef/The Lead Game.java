// The Lead Game
// Problem code: TLG
// https://www.codechef.com/problems/TLG

import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0, temp = 0, n = t;
        int run[] = new int[t];
        int play[] = new int[t];
        int p1 = 0, p2 = 0;
        while(t != 0)
       {
           int p3 = 0, p4 = 0;
            p3= s.nextInt();
            p4 = s.nextInt();
            p1 += p3;
            p2 += p4;
            if (p1 > p2) {
                run[i] = p1 - p2;
                play[i] = 1;
            } else {
                run[i] = p2 - p1;
                play[i] = 2;
            }
            i++;
            t--;
        }
        t = n;
        for (i = 0; i < t-1; i++) {
            for(int j = i+1; j < t; j++) {
                if (run[i] > run[j]) {
                    temp = run[i];
                    run[i] = run[j];
                    run[j] = temp;

                    temp = play[i];
                    play[i] = play[j];
                    play[j] = temp;
                }
            }
        }
        System.out.println(play[t-1] + " " + run[t-1]);
    }
}
