//Common elements in all rows of a given matrix

import java.util.*;
class Main {
    public static void main(String[] args) {
        int mat[][] ={
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
        
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int j = 0; j < n; j++)
            map.put(mat[0][j],1);
            
        for (int i = 1; i < m; i++){
            for (int j = 0; j < n; j++){
                if (map.get(mat[i][j]) != null && map.get(mat[i][j]) == i){
                    map.put(mat[i][j], i + 1);
                    if (i == m - 1)
                        System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}

// This code contributed by Rajput-Ji
