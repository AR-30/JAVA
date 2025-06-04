// Given an array of n integers (positive, negative, or zero), find the contiguous subarray (containing at least one number) which has the largest sum, and return that sum.

//eg - For array [1, 2, -5, 4, 3], the subarrays [1, 2], [-5, 4], and [4, 3] are contiguous.

//the subarrays can be of any size with a minimum of 1.

import java.lang.Math;

class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4};
        int maxSum=arr[0];
        int currSum=arr[0];
        
        for(int i=0; i<arr.length; i++){
          currSum=Math.max(arr[i],currSum+arr[i]);
          maxSum=Math.max(maxSum,currSum);
        }
        System.out.print("Max sum of a subarray = "+maxSum);
    }
}
