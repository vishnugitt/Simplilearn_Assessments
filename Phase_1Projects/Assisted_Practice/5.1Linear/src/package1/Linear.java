package package1;

import java.util.Scanner;

public class Linear
{
	    public static void main(String[] args)
	    {
	        int[] arr = {100,226,318,164,52};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Element to be searched");
	        int searchValue = sc.nextInt();
	            int result = (int) linearing(arr,searchValue);
	            if(result==-1){
	                System.out.println("Element is not present in the array");
	            }
	            else 
	            {
	                System.out.println("Element found at "+result+" and the  key is "+arr[result]);
	            }
	        }
	public static int linearing(int arr[], int x) 
	{
	    int arrlength = arr.length;
	    for (int i = 0; i < arrlength - 1; i++) 
	    {
	        if (arr[i] == x) 
	        {
	            return i;
	         }
	     }
	            return -1;
	   }

}
