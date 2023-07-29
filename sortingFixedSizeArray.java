//SORTING FIXED SIZE ARRAY.

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr[i]= sc.nextInt();
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for(int i=0; i<size; i++){
		    System.out.print(arr[i]+" ");
		}
	
	}
}
