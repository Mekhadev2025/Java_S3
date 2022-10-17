import java .io.*;
import java .util.*;
public class freq
{
 public static void main(String args[])
{int count=0;
Scanner sc =new Scanner(System.in);
 System.out.println("Enter the character");
char ch=sc.next().charAt(0);
sc.nextLine();
 System.out.println("Enter the string");

String str=sc.nextLine();                                                                                
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);
 if(c==ch)
 count++;
 }
 
 System.out.println(count);
 }
 }
