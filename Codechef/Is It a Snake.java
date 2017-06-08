// Is It a Snake
// Problem Code: ISSNAKE

// https://www.codechef.com/SNCKPA17/problems/ISSNAKE

import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t != 0)
        {
            int n;
            n = s.nextInt();
            char li[][] = new char[n][2];
            for(int i=0; i< 2; i++)
                for(int j=0; j<n; j++)
                    li[i][j] = s.nextChar();

            for(int i=0; i< 2; i++)
                for(int j=0; j<n; j++)
                    li[i][j] = s.nextChar();

            t=t-1;
        }


    }
}