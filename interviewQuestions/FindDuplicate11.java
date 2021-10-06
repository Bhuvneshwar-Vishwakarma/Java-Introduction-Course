package interviewQuestions;

import java.util.*;

public class FindDuplicate11 {
	
	public int findDuplicate(int[] nums) {
		Set<Integer> seen = new HashSet<Integer>();      //This aproch is O(n)
		for (int num : nums) {
			if (seen.contains(num)) {
				return num;
			}
			seen.add(num);
		}
		
		return -1;
	}
//	
//	class Solution {
//	    public int findDuplicate(int[] nums) {
//	        Arrays.sort(nums);
//	        for (int i = 1; i < nums.length; i++) {      //aprroch is nlog(n)
//	            if (nums[i] == nums[i-1]) {
//	                return nums[i];
//	            }
//	        }
//
//	        return -1;
//	    }
//	}



	public static void main(String[] args) {
		

	}

}
