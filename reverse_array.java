//reversing Array

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
