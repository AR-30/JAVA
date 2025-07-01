//Find the triplet that sum to a given value
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 4, 6};
        int k = 14;
        
        Arrays.sort(arr);
        
        for(int a = 0; a<arr.length-2; a++){
            int b = a + 1;
            int c = arr.length - 1;
            while(b < c){
                int sum = arr[a] + arr[b] + arr[c];
                if(sum > k){
                    c--;
                }
                else if(sum < k){
                    b++;
                }
                if(sum == k){
                    System.out.println("Triplet found: " +arr[a]+" "+arr[b]+" "+arr[c]);
                    return;
                }
            }
        }
            System.out.print("no triplet found");
    }
}
