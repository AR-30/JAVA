//5.Given 2 arrays find  i)union  

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.print("Input Array 1 size : ");
		int s1 = sc.nextInt();
		
		int[] arr1 = new int[s1];
		System.out.print("Input Array 1 : ");
		for(int i=0; i<s1; i++){
		    arr1[i]= sc.nextInt();
		}
		System.out.print("Input Array 2 size : ");
		int s2 = sc.nextInt();
		
		int[] arr2 = new int[s2];
		System.out.print("Input Array 2 : ");
		for(int i=0; i<s2; i++){
		    arr2[i]= sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
    for(int i : arr1){
        set.add(i);
    }        
    for(int i : arr2){
        set.add(i);
    }
    System.out.println("Union of arrays: ");
    for (Integer element : set) {
        System.out.print(element + " ");
    }
	}
}
