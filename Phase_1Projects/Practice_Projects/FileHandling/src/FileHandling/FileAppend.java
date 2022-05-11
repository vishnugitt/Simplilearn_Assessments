package FileHandling;

import java.io.*;

public class FileAppend 
{
   public static void main(String[] args)
   {
	      // Append text to Existing File.
	     
	   String path = "D:\\File\\Info.txt";
	     String text = "Java is a programming language";
	  try
	  {
	    FileWriter f = new FileWriter(path,true);
	    f.write(text);
	    f.close();
	    System.out.println("Append is done Successfully");
	  }
	  catch(IOException e)
	  {
	    System.out.println(e);
	  }
   }
}

