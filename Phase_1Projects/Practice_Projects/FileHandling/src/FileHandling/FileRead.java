package FileHandling;

import java.io.*;

public class FileRead 
{
   public static void main(String[] args)
   {
	   
		   //Reading an Existing file
	
      try
      {
    	  FileReader r = new FileReader("D:\\File\\Info.txt");
      try
      {
	    int i;
	
	  while((i=r.read())!=-1)
	  {
	      System.out.print((char)i);
	  }
	
      }
	  finally
	  {
	     r.close();
	     System.out.print("\n");
	     System.out.print("File is Closed");
	  }
      }
	  catch(IOException e)
	  {
	     System.out.println("Exception handled");
	  }
   }
}
