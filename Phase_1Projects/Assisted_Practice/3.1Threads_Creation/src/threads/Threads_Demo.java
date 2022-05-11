package threads;

public class Threads_Demo extends Thread
{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Threads_Demo d = new Threads_Demo();
	  		d.start();
	 	}
}

