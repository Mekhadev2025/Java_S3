import java.io.*;
import java.util.*;
public class matrix
{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter row size of matrix 1");
int m=sc.nextInt();
System.out.println("Enter column size of matrix 1");
int n=sc.nextInt();
System.out.println("Enter row size of matrix 2");
int p=sc.nextInt();
System.out.println("Enter column size of matrix 2");
int q=sc.nextInt();
while(n!=p)
{
System.out.println("Re enter ");
System.out.println("Enter row size of matrix 1");
  m=sc.nextInt();
System.out.println("Enter column size of matrix 1");
  n=sc.nextInt();
System.out.println("Enter row size of matrix 2");
  p=sc.nextInt();
System.out.println("Enter column size of matrix 2");
  q=sc.nextInt();
}
 int a[][]=new int[m][n];
 int b[][]=new int[p][q];
 int c[][]=new int[m][q];
 
 System.out.println("Enter the matrix 1");
 
  for(int i=0;i<m;i++)
 {
 for(int j=0;j<n;j++)
 {
  a[i][j]=sc.nextInt();
 }
 }
 
 
  System.out.println("Enter the matrix 2");
 
 for(int i=0;i<p;i++)
 {
 for(int j=0;j<q;j++)
 {
  b[i][j]=sc.nextInt();
 }
 }
 
 
 
 
 
 for(int i=0;i<m;i++)
 {
 for(int j=0;j<q;j++)
 {
 for(int k=0;k<q;k++)
 {
 c[i][j]=c[i][j]+a[i][k]*b[k][j];
 }
 }
 }
 for(int i=0;i<m;i++)
 {
 for(int j=0;j<q;j++)
 {
 System.out.print(c[i][j]+" ");
 }
 System.out.println();
 }
 }
 }
 
 
 
 
 
 
