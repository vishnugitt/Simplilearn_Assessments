package method;

public class Methods
{
		public int multipynumbers(int a,int b) 
		{
			int z=a*b;
			return z;
		}

		public static void main(String[] args)
		{
			Methods b=new Methods();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
	   		
	    }

}
