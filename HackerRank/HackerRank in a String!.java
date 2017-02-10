// HackerRank in a String!
// https://www.hackerrank.com/contests/rookierank-2/challenges/hackerrank-in-a-string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String chk = "hackerrank";
        for (int a0 = 0; a0 < q; a0++) {
            int c = 0;
            String s = in.next().toLowerCase();
            int l = s.length();
            for (int i=0; i < l; i++) {
                if (s.charAt(i) == chk.charAt(c))
                {
                    c++;
                }
                if (c == chk.length())
                    break;
            }
            if(c == chk.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
