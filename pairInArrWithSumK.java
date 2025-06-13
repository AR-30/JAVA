//find all pairs on integer array whose sum is equal to given number
//Time complexity - O(nlogn)  {sorting - nlogn, pointer movment - n}
//Space complexity - O(n)

import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr={7, 10, 1, 3, 6, 9, 2};
	    int k = 8;
	    
	    int n=arr.length;
        Arrays.sort(arr);
        
        System.out.println("Pairs with sum " + k + ":");
        int left=0;
        int right=n-1;
        
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==k){
                System.out.println("{"+arr[left]+","+arr[right]+"}");
                left++;
                right--;
            }else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
	}
}
