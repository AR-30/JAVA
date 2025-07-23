// number spiral pattern
/* sample output: n=5
  1  2  3  4  5
 16 17 18 19  6
 15 24 25 20  7
 14 23 22 21  8
 13 12 11 10  9     */
 
public class Main {
    public static void main(String[] args) {
        int n = 5; 
        int[][] spiral = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (num<=n*n) {
            // Fill top row
            for (int i = left; i <= right; i++)
                spiral[top][i] = num++;
            top++;
            // Fill right column
            for (int i = top; i <= bottom; i++)
                spiral[i][right] = num++;
            right--;
            // Fill bottom row
            for (int i = right; i >= left; i--)
                spiral[bottom][i] = num++;
            bottom--;
            // Fill left column
            for (int i = bottom; i >= top; i--)
                spiral[i][left] = num++;
            left++;
        }
        // Print the spiral matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", spiral[i][j]);
            }
            System.out.println();
        }
    }
}
