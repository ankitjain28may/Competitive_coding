// Snape and Ladder
// Problem code: SNAPE
// https://www.codechef.com/problems/SNAPE

import java.util.*;
import java.io.*;
class Main
{
  public static void main(String arg[])throws IOException
  {
    Scanner s = new Scanner(System.in);
    int b, ls;
    double rs1, rs2;
    int t = s.nextInt();
    while (t != 0)
    {
      b = s.nextInt();
      ls = s.nextInt();
      rs1 = Math.sqrt(b*b + ls*ls);
      rs2 = Math.sqrt(ls*ls - b*b);
      System.out.println(rs2 + " " + rs1);
      t--;
    }
  }
}