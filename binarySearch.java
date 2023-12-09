//Binary Search

import java.util.Scanner;

public class BinarySearch {
    static void binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                System.out.println("Element " + key + " found at index " + mid);
                return;
            }
            if (array[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
	    }
	    System.out.println("Element " + key + " not found in the array");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter array size ");
        int n=sc.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
            array[i]=sc.nextInt();
            
        System.out.print("Enter element to search ");
        int key = sc.nextInt();
        binarySearch(array, key);
    }
}
