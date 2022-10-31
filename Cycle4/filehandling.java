
import java.io.*;
public class filehandling {
    public static void main(String args[])
{
   try{
    FileWriter f=new FileWriter( "/home/mec/Mekha_CS3A/file.txt");
    f.write("Hey this is mekha here");
    f.close();
    System.out.println("Succesfully written ");

   }
   catch(IOException e){
    System.out.println("Error Occured");
    e.printStackTrace();
   }
   char[] array=new char[200];
   try{
    FileReader f3=new FileReader("/home/mec/Mekha_CS3A/file.txt");
    f3.read(array);
    System.out.println("The file Contains \n --------------");
    System.out.println(array);
    f3.close();
   }
    catch(IOException e)
    {
        System.out.println("An error occured");
        e.printStackTrace();

    }
   }
   }
   




 