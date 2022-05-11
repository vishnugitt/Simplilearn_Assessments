package threads;

import java.io.*; 
import java.util.*; 
    class Sender 
	{ 
	    public void send(String msg) 
	    { 
	            System.out.println("Sending\t"  + msg ); 
	      try
	      { 
	            Thread.sleep(1000); 
	      } 
	      catch (Exception e) 
	      { 
	            System.out.println("Thread  interrupted."); 
	      } 
	            System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class Thread_Synchro extends Thread 
	{ 
	    private String msg; 
	    private Thread t; 
	    Sender  sender; 
	 
	    Thread_Synchro(String m,  Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 
	class SyncDemo 
	{ 
	    public static void main(String args[]) 
	    { 
	        Sender snd = new Sender(); 
	        Thread_Synchro S1 = new Thread_Synchro( " Hi " , snd ); 
	        Thread_Synchro S2 = new Thread_Synchro( " Bye " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 
	    } 
	} 

