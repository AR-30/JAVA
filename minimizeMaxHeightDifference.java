// Java program to minimize the maximum difference between heights using Sorting

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //initial heigth array
        int[] arr={12, 6, 4, 15, 17, 10};
        int k=6;
        
        Arrays.sort(arr);
        int n=arr.length;
        
        //initial difference
        int res = arr[n - 1] - arr[0];
        
        //For all indices i, increment arr[0...i-1] by k and decrement arr[i...n-1] by k
        for(int i=1; i<n; i++){
            if(arr[i]-k<0){
                continue;
            }
            // Minimum height after modification
            int minH=Math.min(arr[0]+k,arr[i]-k);
            // Maximum height after modification
            int maxH=Math.max(arr[n-1]-k,arr[i-1]+k);
            
            //minimum difference as result
            res=Math.min(res,maxH-minH);
        }
        System.out.print("Minimum height difference - "+res);
    }
}
