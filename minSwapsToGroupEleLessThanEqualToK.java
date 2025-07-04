// Minimum swaps required bring elements less equal K together
//Time: O(n)
//Space: O(1)

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        
        //total num of ele less than equal to k
        int good = 0;
        for(int ele : arr){
            if(ele <= k){
                good++;
            }
        }
        
        //num of bad ele in first sliding window
        int bad = 0;
        for(int i=0; i<good; i++){
            if(arr[i] > k){
                bad++;
            }
        }
        int swaps = bad;
        
        //finding min bad while sliding window
        for(int i = 1, j = good; j<arr.length; i++, j++){
            if(arr[i-1] > k) bad--;
            if(arr[j] > k) bad++;
            swaps = Math.min(swaps,bad);
        }
        
        System.out.print("Minimum swaps required: " + swaps);
    }
}
