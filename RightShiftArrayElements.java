// Take an array and right shift it by the given value k.
// Eg. Input : Array - 2 4 6 8 7 9 , k=2
//     Output: Array - 7 9 2 4 6 8

import java.util.Scanner;
public class Main
{
    static void reverse(int arr[], int start, int end){
        int temp;
        while (start < end){
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr[i]= sc.nextInt();
		}
		System.out.println("Enter k value");
		int k = sc.nextInt();
		
		if(k>size){
		    k=k%size;
		}
		
		reverse(arr,0,size-1);
		reverse(arr,0,k-1);
		reverse(arr,k,size-1);
		
		System.out.println("Resultant array:");
		for(int i=0; i<size; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}



//BRUTE FORCE METHOD


import java.util.Scanner;
public class Main
{
    public static void rightShift(int arr[], int k, int size){
       for (int i=0; i<k; i++) {
            int last = arr[size-1];
            for (int j = size-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
    }
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Input Array");
		for(int i=0; i<size; i++){
		    arr[i]= sc.nextInt();
		}
		System.out.println("Enter k value");
		int k = sc.nextInt();
		
		if(k>size){
		    k=k%size;
		}
		
		rightShift(arr,k,size);
		
		System.out.println("Resultant array:");
		for(int i=0; i<size; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
