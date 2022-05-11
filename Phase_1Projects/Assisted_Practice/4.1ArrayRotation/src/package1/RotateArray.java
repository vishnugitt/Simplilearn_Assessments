package package1;

	class A  
	{ 
	  public void rotate(int[] nums, int k) 
	  {
		   if(k > nums.length) 
		      k=k%nums.length;
		 	int[] result = new int[nums.length];
		 	
		 	for(int i=0; i < k; i++)
		 	{
		        	result[i] = nums[nums.length-k+i];
		 	}
		 		int j=0;
		    		
		 	for(int i=k; i<nums.length; i++)
		    {
		        result[i] = nums[j];j++;
		    }
		 		System.arraycopy( result, 0, nums, 0, nums.length );
		}
	} 
		public class RotateArray
		{
			public static void main(String[] args) {
				RotateArray r = new RotateArray();
		        		int arr[] = { 9, 10, 11, 12, 13, 14, 15 }; 
		        		
		        		//r.rotate(arr[i], 5); 
		        		
		        		for(int i=0;i<arr.length;i++){
		            			System.out.print(arr[i]+" ");
		        		}
			}
		}
