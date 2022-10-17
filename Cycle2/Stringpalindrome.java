//program to find the plalindrome of a number
import java.io.*;
import java.util.*;

public class palindrome
{


public static void main(String args[])
{
String str="";
String rev="";
Scanner sc =new Scanner(System.in);
System.out.println("enter the string ");
str=sc.nextLine();

  for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
rev=ch +rev;
} 
if(rev.equalsIgnoreCase(str))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
 }
                                                                                                   
