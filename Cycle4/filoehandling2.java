import java.io.*;
public class filoehandling2 {
    public static void main(String args[])
{
   try{
    File f=new File("/home/mec/Mekha_CS3A/file2.txt");
    if (f.createNewFile())
    {
        System.out.println("File created  "+f.getName());
    }   
    else{
        System.out.println("File already exists");
    }
}
    catch(IOException e){
    System.out.println("Error Occured");
    e.printStackTrace();
   }
   try{
    FileWriter f2=new FileWriter( "/home/mec/Mekha_CS3A/file2.txt");
    f2.write("Hey this file was written by mekha of cs3a");
    f2.close();
    System.out.println("Succesfully written ");

   }
   catch(IOException e){
    System.out.println("Error Occured");
    e.printStackTrace();
   }


   char[] array=new char[200];
   try{
    FileReader f3=new FileReader("/home/mec/Mekha_CS3A/file2.txt");
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
   




 
