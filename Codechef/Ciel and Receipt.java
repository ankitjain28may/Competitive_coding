// Ciel and Receipt
// Problem code: CIELRCPT
// https://www.codechef.com/problems/CIELRCPT

import java.util.*;
import java.io.*;
class Main
{
  public static void main(String arg[])throws IOException
  {
    int a[] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
    Scanner s = new Scanner(System.in);
    int sum, v;
    int t = s.nextInt();
    while (t != 0)
    {
      sum = 0;
      v = s.nextInt();
      if (v >= a[11]) {
        while ( v >= a[11]) {
          v = v - a[11];
          sum++;
        }
      }

      for (int i = 10; i >=0; i--) {
        if (v >= a[i]) {
          v = v - a[i];
          sum++;
        }
      }
      sum = sum + v;
      System.out.println(sum);
      t--;
    }
  }
}