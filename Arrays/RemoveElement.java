package Arrays;

public class RemoveElement {
	 public static int removeElement(int[] nums, int val) {
	        int count=0;
	        for(int index=0;index<nums.length;index++)
	        {
	            if(nums[index]!=val)
	            {
	                nums[count]=nums[index];
	                count++;
	            }
	        }
	        
	        return count;
	    }

	public static void main(String[] args) {
		int[] number= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(number,val));
	}

}
