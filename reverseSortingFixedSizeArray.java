//SORTING A FIXED SIZE ARRAY IN REVERSE ORDER.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr[i]= sc.nextInt();
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Sorted array:");
		for(int i=0; i<size; i++){
		    System.out.print(arr[i]+" ");
		}
	
	}
}
