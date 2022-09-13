package BinarySearch;

public class PerfectSqure {

	public static  boolean isPerfectSquare(int num) {
        int start = 1, end = num+1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid < num)
                start = mid + 1;
            else
                end = mid - 1;
        }	
        
        return false;
       /*
         int start=1, end=num/2, root=1;
        while(start<=end)
        {
            double mid=start+(end-start)/2;
            if(mid==num/mid)        //if the middle element is a perfect square
                return true;

            else if(mid<num/mid)
            {
                start=(int)mid+1;
                root=(int)mid;
            }

            else
                end=(int)mid-1;
        }
        if(root*root==num)          //Important, when checking for values like 1, where end<start
            return true;

        else
            return false;
        */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=42;
		System.out.println(isPerfectSquare(num));
	}

}
