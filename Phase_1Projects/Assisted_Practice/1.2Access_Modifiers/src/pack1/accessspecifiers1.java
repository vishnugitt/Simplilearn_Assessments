package pack1;

  class defAccessSpecifier 
{
	 void display()
   {
		   System.out.println("You are using defalut access specifier");
   }
}

  public class accessspecifiers1 
{
	public static void main(String[] args) 
	{
			System.out.println("Dafault Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display();
	}
}

 class priaccessspecifier 
	{ 
	   private void display()
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 


 class accessspecifier2
 {
    public static  void main(String[] args)
    {
 	   System.out.println("Private Access Specifier");
 		priaccessspecifier  obj = new priaccessspecifier(); 

    }
 }
