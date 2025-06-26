/*Count Inversion 
Meaning : Inversion Count for an array indicates that how far (or close) the array is from being sorted. 
If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is maximum. 

METHOD 1 - Using Two Nested Loops 
Time - O(n^2)
Space - O(1) */

class Main {
    public static void main(String[] args) {
        int arr[] = {1,6, 7, 4, 5};
        
        int count = 0;
        
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
