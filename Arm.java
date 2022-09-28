import java.io.*;
 
public class Arm
{
public static void main(String args[])
{
  double sum=0;
  int n=153;
  int m=n;
  while(m>0)
 {
 
 int temp=m%10;
 sum=sum+Math.pow(temp,3);
 m=m/10;
 
 
 
}
if(sum==n)
{
System.out.println("Armstrong");
}
else
System.out.println("Not Armstrong");


}
}
