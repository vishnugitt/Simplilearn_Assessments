package longestincease;

public class LongestIncrease 
{

    public static int Longest(int[] arr, int i, int n, int prev)
	 {
	 // Base case: nothing is remaining
	 if (i == n) 
	 {
	   return 0;
	 }
	 
	 // case 1: exclude the current element and process the
	 // remaining elements
	 int excl = Longest(arr, i + 1, n, prev);
	 
	 // case 2: include the current element if it is greater
	 // than the previous element in LIS
	 int incl = 0;
	 
	 if (arr[i] > prev) 
	 {
	 incl = 1 + Longest(arr, i + 1, n, arr[i]);
	 }
	 
	   return Integer.max(incl, excl);
	 }
	 public static void main(String[] args)
	 {
	    int[] arr = {11, 6, 8, 21, 15, 16, 62, 25, 48, 32, 90,16 };
	    System.out.print("The length of the Longest is "+ Longest(arr, 9, arr.length, Integer.MIN_VALUE));
	 }
}
