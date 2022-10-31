import java.io.*;
public class filehandlin2 {
    public static void main(String args[]) throws IOException
 {
    //-------------------------------------------------------------
   char[] array=new char[200];
   try{
    FileReader f3=new FileReader("/home/mec/Mekha_CS3A/file.txt");
    f3.read(array);
    System.out.println("The file Contains \n --------------");
    System.out.println(array);
    f3.close();
   }

    catch (FileNotFoundException e)
    {
      throw new FileNotFoundException("File Not Found"); 
    }
catch(IOException e)
    {   
       throw new IOException("Error Occured");
    }

    //---------------------------------------------------------
    try{
        FileWriter f=new FileWriter("/home/mec/Mekha_CS3A/file.txt");
        f.write("Nice to meeet you ");
        f.close();
        System.out.println("Succesfully written ");
    
       }
       catch (FileNotFoundException e)
       {
         throw new FileNotFoundException("File Not Found"); 
       }

       catch(IOException e){
        System.out.println("Error Occured");
        e.printStackTrace();
       }


       //------------------------------------------------------------------------
 //-------------------------------------------------------------
 char[] arr=new char[200];
 try{
  FileReader f3=new FileReader("/home/mec/Mekha_CS3A/file.txt");
  f3.read(arr);
  System.out.println("The file Contains \n --------------");
  System.out.println(arr);
  f3.close();
 }

  catch (FileNotFoundException e)
  {
    throw new FileNotFoundException("File Not Found"); 
  }
catch(IOException e)
  {   
     throw new IOException("Error Occured");
  }
 }
}

 
    
  