package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;


public class Intersection2Arrays {
	static int[] intersection(int[] nums1, int[] nums2) 
	{
		ArrayList < Integer> l= new ArrayList<>();  
        
        Arrays.sort( nums1); 
        Arrays.sort(nums2);
        
        int i=0 ,j=0;
           while(i < nums1.length && j < nums2.length) {  
            if(nums1[i] == nums2[j]) {
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {  
                i++;
            }
            else {
                j++;
            }
        }
        ArrayList<Integer> nList = removeDuplicates(l);
        
        int[] arr = new int[nList.size()];

            for (int k = 0; k < nList.size(); k++) {
                arr[k] = (int) nList.get(k);
            }
            return arr;


    }
    
    public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
    {
  
        // Create a new ArrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();
  
        // Traverse through the first list
        for (Integer element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {1,2,3,4,5,3,2};
		int[] num2= {2,4,7,3,4,2};
		System.out.println(Arrays.toString(intersection(num1,num2)));
	}

}
