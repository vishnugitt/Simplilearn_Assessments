package package1;

public class Binary 
{

	    public static  void main(String[] args)
	    {


	        int[] arr = {37,67,99,118,125};
	        int key = 118;
	        int arrlength = arr.length;
	        binarySearch(arr,0,key,arrlength);
	    }
	   public static void binarySearch(int[] arr, int start, int key, int length)
	   {
	        int midValue = (start+length)/2;
	    
	        while(start<=length)
	        {
	            if(arr[midValue]<key)
	            {
	                start = midValue + 1;
	            }
	            else if(arr[midValue]==key)
	            {
	                System.out.println("Element present at index :"+midValue);
	                break;
	            }
	            else 
	            {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length)
	            {
	                System.out.println("Element is not present");
	            }
	   }

}
