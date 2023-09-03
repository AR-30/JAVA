//Given an Array. Find if a no. is present or not using set.

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

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
		
		Set<Integer> set = new HashSet<>();
        	for(int i : arr){
            		set.add(i);
       		 }
        	System.out.println("Enter number to check ");
        	int k = sc.nextInt();
        	int ans=0;
        	for(int i=0; i<set.size(); i++){
           		if(set.contains(k))
                		ans=1;
            		else
                		ans=0;
        	}
		System.out.println("Result : "+ans);
	}
}
