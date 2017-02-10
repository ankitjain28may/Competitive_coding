// Migratory Birds
// https://www.hackerrank.com/contests/rookierank-2/challenges/migratory-birds

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] value = {0,0,0,0,0,0};
        int index = 0;
        for(int types_i=0; types_i < n; types_i++){
            value[in.nextInt()]++;
        }

        for (int i=1; i < 6; i++) {
            if (value[0] < value[i])
            {
                value[0] = value[i];
                index = i;
            }
        }
        System.out.println(index);

    }
}
