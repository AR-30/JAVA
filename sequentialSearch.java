//Sequential search : searching an element n an array 

import java.util.Scanner;

class SequentialSearch {
    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter array size ");
        int n=sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
            
        System.out.print("Enter element to search ");
        int x = sc.nextInt();     
        
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present"+ " at index "+ result);
    }
}
