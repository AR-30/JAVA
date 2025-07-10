//Find row with maximum no. of 1's

class Main {
    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 } };
                        
        int row = mat.length;
        int col = mat[0].length;
        
        int max_row_index = -1, r = 0, c = col - 1; 
        
        while(r<row && c>=0){
            if(mat[r][c] == 1){
                max_row_index = r;
                c--;
            }else{
                r++;
            }
        }
        
        System.out.print("Index of row with maximum 1s is " + max_row_index);
    }
}
