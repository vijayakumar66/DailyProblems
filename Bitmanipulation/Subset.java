package bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	 public static List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> result=new ArrayList<>();
		 int n=nums.length;
		 for(int i=0;i<(1<<n);i++)//how many values to store in array to run till 1<<3=8-1;
		 {
			 List<Integer> set=new ArrayList<Integer>();
			 for(int j=0;j<n;j++)
			 {
				 if((i&(1<<j))!=0)
				 {
					 set.add(nums[j]);
				 }
			 }
			 result.add(set);
			 
	     }
		 return result;

	 }
	public static void main(String[] args) {
		int[] num= {1,2,3};
		System.out.println((subsets(num)));
		
	}

}
