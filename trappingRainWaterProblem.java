//Trapping Rain water problem
//water will be trappped only when there is higher level on both sides of a element.
//Time - O(n^2) and Space - O(1) 

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 3, 1, 0, 4 };
        
        int res = 0;
        for(int i = 1; i<arr.length-1; i++){
            
            int left = arr[i];
            for(int j=0; j<i; j++){
                left = Math.max(left, arr[j]);
            }
            
            int right = arr[i];
            for(int j=i+1; j<arr.length; j++){
                right = Math.max(right, arr[j]);
            }
            
            res += Math.min(left, right) - arr[i];
        }
        
        System.out.print(res);
    }
}



//----------------------------------------------------------------------------------------------------



//METHOD 2 
//Time - O(n) and Space - O(1) 

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        int n = arr.length;
        
        int left = 1;
        int right = n - 2;

        int lMax = arr[0];
        int rMax = arr[n-1];

        int res = 0;
        while (left <= right) {
            if (rMax <= lMax) {
                res += Math.max(0, rMax - arr[right]);
                rMax = Math.max(rMax, arr[right]);
                right -= 1;
            } else { 
                res += Math.max(0, lMax - arr[left]);
                lMax = Math.max(lMax, arr[left]);
                left += 1;
            }
        }
        System.out.println(res);
    }
}
