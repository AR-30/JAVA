//SORTING OF DYNAMIC SIZE ARRAY in REVERSE ORDER.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr.add(sc.nextInt());
		    System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("Sorted array:");
		for(int i=0; i<size; i++){
		    System.out.print(arr.get(i)+" ");
		}
	}
}
