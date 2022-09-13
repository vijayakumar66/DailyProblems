package BinarySearch;

import java.util.Arrays;

public class KthNumber {
	static int findKthPositive(int[] arr, int k) {
		/*O(n) linear Search
		 *  public int findKthPositive(int[] arr, int k) {
//         for(int i=0; i<arr.length; i++){
//             if(k>=arr[i]) k++;
//             else break;
//         }
//         return k;
//     }
		 */
		//Binary Search o(log n)
		 int start=0, end=arr.length-1,mid;
	        while(start<=end)
	        {
	            mid = start+(end - start)/2;
	            if((arr[mid]-1-mid)<k)  //number of elements missing till arr[mid]
	            {
	                start=mid+1;
	            }
	            else
	                end=mid-1;
	        }
	        return start+k;
    
    }

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int k=2;
		System.out.println(findKthPositive(arr,k));
 
	}
}
