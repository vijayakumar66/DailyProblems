package Arrays;

import java.util.Arrays;

public class ZeroLastindex {

	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[++index]=nums[i];
                if(index!=i)
                {
                    nums[i]=0;
                }
                
            }
        }
        System.out.println(Arrays.toString(nums));
	}

}
