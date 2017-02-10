// Chef and His Apartment Dues
// Problem code: CHEFAPAR
// https://www.codechef.com/FEB17/problems/CHEFAPAR

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int t;
    t = in.nextInt();
    while (t != 0)
    {
      int n = in.nextInt();
      int a[] = new int[n];
      int p = 1;
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] == 0)
        {
          sum += 1000;
          p = 0;
        }
        if (p == 0)
        {
          sum += 100;
        }
      }
      System.out.println(sum);
      t--;
    }
  }
}
