// Finding Square Roots
// Problem code: FSQRT
// https://www.codechef.com/problems/FSQRT


import java.io.*;
class sq{
public static void main(String arg[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t!=0){
int N =Integer.parseInt(br.readLine());
System.out.println((int)Math.sqrt(N));
t--;
}
}
}  