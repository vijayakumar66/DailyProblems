package BinarySearch;

public class PeakElement {
	static int peakIndexInMountainArray(int[] arr) {
        int left=0,mid=0;
        int right=arr.length-1;
        while(left<right)
        {
            mid=left+(right-left)/2;
            if (arr[mid] > arr[mid+1] && arr[mid-1] < arr[mid])
                return arr[mid];
            else if (arr[mid+1] > arr[mid])
                left = mid + 1;
            else 
                right= mid - 1;
           
        }                                             
     return -1;                                                                        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,7,8,6,4,3,2};
		System.out.println(peakIndexInMountainArray(arr));
	}

}
