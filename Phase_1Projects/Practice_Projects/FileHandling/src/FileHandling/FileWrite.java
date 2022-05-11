

package FileHandling;

import java.io.*;

public class FileWrite 
{
	 public static void main(String[] args)
 {
	 
		 //Writing in the file

	   try
	  {
	    FileWriter f = new FileWriter("D:\\File\\Info.txt");
	   try
	  {
	    f.write("Welcome to the world of Java.");
	  }
	   finally
	  {
	    f.close();
	  }
	    System.out.println("Task Completed Successfully");
	  }
	    catch(IOException i)
	  {
	    System.out.println(i);
	  }

 }

}

