//Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
//Output Format -> Return starting and ending index of first subarray whose sum = 0, if exists otherwise return [-1, -1]

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr[i]= sc.nextInt();
		}
		int j;
		for(int i=0; i<size; i++){
		    int sum=0;
		    for(j=i; j<size; j++){
		        sum=sum+arr[j];
		        if(sum==0){
		        System.out.println("["+i+","+j--+"]");
		        return;
		        }
		    }
		}
		System.out.println("[-1,-1]");
	}
}
