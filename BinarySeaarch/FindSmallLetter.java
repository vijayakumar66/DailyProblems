package BinarySearch;

public class FindSmallLetter {
	 static char nextGreatestLetter(char[] letters, char target) {
	        int left=0;
	        int right=letters.length-1;
	        while(left<=right)
	        {
	        	int mid=left+(right-left)/2;
	        	
	        	if(letters[mid]>target) {
	        		
	        		right=mid-1;
	        	}
	        	else
	        	{
	        		left=mid+1;
	        		
	        	}
	        }
	        int res=(int)left%letters.length;//this function is work 
	        								//3%4->0.75
	        								//the whole number of (before answer is)0 X 4=0(divisor)
	        								//3-0(before answer)=0/thats answer to return
	        System.out.println(res);
			return letters[res];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		char[] letters={'c','d','e','f'};
		char target='d';
		System.out.println(nextGreatestLetter(letters,target));
	}

}
