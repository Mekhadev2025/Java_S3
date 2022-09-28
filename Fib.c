import java.io.*;
public class Fib
{
public static void main(String args[])
{
 int a=1,b=1;
 int n=10;
 System.out.print(a+" "+b+" ");
 for(int i=0;i<10;i++)
 {
 c=a+b;
 System.out.print(c+" ");
 a=b;
 b=c;
 
}
}
