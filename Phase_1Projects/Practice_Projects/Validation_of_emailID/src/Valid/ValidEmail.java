package Valid;

    import java.util.ArrayList;
	import java.util.List;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ValidEmail 
	{
	   private static final String regex= "^(.+)@(.+)$";
	   public static void main(String args[])
	   {
		   List<String>emails=new ArrayList<String>();
		   
		   //Valid
		   emails.add("vishnu@example.com");
		   emails.add("vishnu#@example.org.in");
		   emails.add("vishnu.sai@example.co.in");
		   
		   //Invalid
		   emails.add("vishnu.example.com");
		   emails.add("vishnu#example.com");
		   emails.add("@#example.com");
		   
		   Pattern p=Pattern.compile(regex);
		   
		   for(String value : emails)
		   {
			   Matcher matcher=p.matcher(value);
			   System.out.println("The Email address"+value+" is "+(matcher.matches()?"Valid":"Invalid"));
		   }
	   }
	   
}
