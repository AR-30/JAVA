//Kth smallest element in a row-column wise sorted matrix
//Time - O(n^2 * log(k))  {O(logk) for heap add and poll operations}
//Space - O(k)

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] mat = 
                    {{10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {24, 29, 37, 48},
                    {32, 33, 39, 50}};
        int k = 5;
        int n = mat.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pq.add(mat[i][j]);
                
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }
        
        System.out.print(k + "th smallest element of the matrix is " + pq.peek());
    }
}
