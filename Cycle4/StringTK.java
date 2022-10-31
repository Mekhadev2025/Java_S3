import java.util.*;

public class StringTK {
    public static void main(String args[])
    {

        int sum=0;
Scanner sc=new Scanner (System.in);
 
System.out.println("Enter the list of numbers separated by a space");
String s=sc.nextLine();
StringTokenizer st =new StringTokenizer(s," ");
while(st.hasMoreTokens()){
    sum=sum+Integer.parseInt(st.nextToken());
}
System.out.println("Sum  of the list of numbers \n----------\n "+sum);
sc.close();
    }
}
 