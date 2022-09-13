package BinarySearch;

public class SearchInsertPosition {
	static int searchInsert(int[] nums, int target) {
	       int start=0,end=nums.length-1,mid=0;
	        while(start<=end)
	        {
	            mid=start+(end-start)/2;
	            if(target==nums[mid])
	                return mid;
	           if(nums[mid]>target)
	               end=mid-1;
	           else
	               start=mid+1;
	        }
	        return start;
	    }

	public static void main(String[] args) {
		int[] nums= {1,3,5,6 };
		int  target=5;
		int ans=searchInsert(nums,target);
		System.out.println(ans);
	}

}
