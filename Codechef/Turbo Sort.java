// Turbo Sort
// Problem code: TSORT
// https://www.codechef.com/problems/TSORT

import java.util.*;
import java.io.*;
class Main
{
  public static void main(String arg[])throws IOException
  {
    Scanner s = new Scanner(System.in);
    int value;
    int t = s.nextInt();
    int a[] = new int[1000000];
    for (int i = 0; i < 1000000; i++) {
      a[i] = 0;
    }
    while (t != 0)
    {
      value = s.nextInt();
      a[value]++;
      t--;
    }
    for (int i = 0; i < 1000000; i++) {
      if (a[i] != 0)
      {
        for (int j = 1; j <= a[i]; j++) {
          System.out.println(i);
        }
      }
    }
  }
}