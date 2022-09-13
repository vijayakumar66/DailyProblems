package Arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicate {
	
	    public static int removeDuplicates(int[] nums) {
	        int size=0;
	        for(int index=0;index<nums.length;index++)
	        {
	            if(index==0||nums[index]!=nums[index-1])
	            {
	                nums[size]=nums[index];
	                size++;
	            }   
	        }
	        return size;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(number));
				
	}

}
