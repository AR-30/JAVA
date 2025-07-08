//Search an element in a matrix

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9},{10, 11, 13},{12, 14, 16}};
        int k = 13;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == k){
                    System.out.print("Element present at index - [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.print("Element not found");
    }
}
