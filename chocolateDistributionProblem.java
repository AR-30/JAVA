/*Chocolate Distribution problem
Given an array arr[] where each element represents the number of chocolates in a packet, and a number m (number of students), the goal is to:
Distribute exactly one packet to each student.
Choose m packets such that the difference between the maximum and minimum chocolates among them is as small as possible.

Time Complexity: n*log(n)
Auxiliary Space: O(1)
*/

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i+m-1<arr.length; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        
        System.out.print(min);
    }
}
