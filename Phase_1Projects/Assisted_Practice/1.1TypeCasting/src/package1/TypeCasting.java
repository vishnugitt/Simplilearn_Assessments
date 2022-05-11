package package1;

public class TypeCasting 
{
	    public static void main(String[] args)
	    {
	    	System.out.println("Implicit Type Casting");
	    	
	    	char a='A';
	    	System.out.println("Value of a :"+a);
	    	
	    	int b=a;
	    	System.out.println("Value of b :"+b);
	    	
	    	float c=a;
	    	System.out.println("Value of c :"+c);
	    	
	    	double d=a;
	    	System.out.println("Value of d :"+d);
	    	
	    	long e=a;
	    	System.out.println("Value of e :"+e);
	    	
	    	System.out.println("\n");
	    	
	    	System.out.println("Explicit Type Casting");
	    	
	    	double x=45.5;
	    	System.out.println("Value of x :"+x);
	    	
	    	int y=(int)x;
	    	System.out.println("Value of y :"+y);
	    	
	    	float z=(float)x;
	    	System.out.println("Value of z :"+z); 
	    }
}
