//Given an array of size n and a number k, find all elements that appear more than " n/k " times.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 2, 2, 5, 6, 6};
        int n = arr.length;
        int k = 4;
        
        int t = n / k;
        Arrays.sort(arr);
        
        System.out.print("All elements that appear more than n/k times are: ");
        
        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > t) {
                    System.out.print(arr[i - 1] + " ");
                }
                count = 1; 
            }
        }
        // Check last element
        if (count > t) {
            System.out.print(arr[n - 1]);
        }
    }
}
