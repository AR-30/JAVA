//min max of an Array

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array size ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements ");
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        System.out.print("Min =  "+arr[0]+"\nMax = "+arr[n-1]);
	}
}
