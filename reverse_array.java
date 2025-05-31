//reversing Array

//using recursive function

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    static void reverse(int[] arr, int start, int end){
        if(start>=end)
            return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);
        return;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array size ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements ");
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
	        reverse(arr,0,n-1);
	        System.out.print("Reversed array - ");
	        for(int i=0; i<n; i++){
	            System.out.print(arr[i]+" ");
	        }
	}
}


//-------------------------------------------------------------------------------------------------------------------

//using for loop

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
