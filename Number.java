# Number
import java.io.*;
import java.util.*;
public class Number
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,reverse=0;
    System.out.println("Enter integer numbers");
    int a=sc.nextInt();
    n=a;
    while(a>0)
    {
      int b=a%10;
      reverse=reverse*10+b;
      a=a/10;
    }
    System.out.println(reverse);
  }
}
