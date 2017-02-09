// Chef and his Students
// Problem code: CHEFSTUD
// https://www.codechef.com/problems/CHEFSTUD

import java.util.*;
import java.io.*;
class Main
{
  public static void main(String arg[])throws IOException
  {
    Scanner s = new Scanner(System.in);
    int talk;
    int t = s.nextInt();
    String str;
    while (t != 0)
    {
        talk = 0;
        str = s.next();
        int l = str.length();
        for (int i = 0; i < l-1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if (ch1 == '<' && ch2 == '>') {
                talk++;
            }
        }
        System.out.println(talk);
        t--;
    }
  }
}