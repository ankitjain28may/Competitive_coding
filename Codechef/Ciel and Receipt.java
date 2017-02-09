// Ciel and Receipt
// Problem code: CIELRCPT
// https://www.codechef.com/problems/CIELRCPT

import java.util.*;
import java.io.*;
class Main
{
  public static void main(String arg[])throws IOException
  {
    Scanner s = new Scanner(System.in);
    int quo, rem, v;
    int t = s.nextInt();
    while (t != 0)
    {
      v = s.nextInt();
      quo = v / 2048;
      rem = v % 2048;

      while (rem > 0) {
        if (rem%2 == 1) {
            quo ++;
        }
        rem/=2;
      }
      System.out.println(quo);
      t--;
    }
  }
}