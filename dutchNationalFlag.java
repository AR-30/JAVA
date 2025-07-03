//Dutch National Flag Algorithm
//Three way partitioning of an array around a given value
//Time - O(n)
//Space - O(1)
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 8, 16, 9, 18, 5, 2, 11};
        int pivot = 11;
        
        int low = 0, mid = 0, high = arr.length-1;
        
        while(mid <= high){
            if(arr[mid] < pivot){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == pivot){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
