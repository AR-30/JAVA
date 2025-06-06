// The problem involves finding the minimum number of jumps required to reach the end of an array, given that each element in the array represents the maximum jump length from that position.
//Time complexity - O(n)

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 2, 6, 7};
        int n=arr.length;
        
        int jumps=0;
        int i=0;
        while(i<n-1){
            if(arr[i]==0){
                jumps=-1;
                break;
            }
            i=i+arr[i];
            jumps++;
        }
        System.out.print("Min jump required -> "+jumps);
    }
}
