//Rearrange the array in alternating positive and negative items with O(1) extra space

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,-4,3,-5,9,-7};
	    Arrays.sort(arr);
	    
	    // Find index of first positive number
	    int i=0;
	    while(arr[i]<0){
	        i++;
	    }
	    
	    int pos=i;  //index of first positive number
	    int neg=0;    
	    
	    while(neg<pos && pos<arr.length && arr[neg]<0){
	        int temp=arr[neg];
	        arr[neg]=arr[pos];
	        arr[pos]=temp;
	        pos++;
	        neg+=2;
	    }
	    
	    System.out.println("Rearranged array:");
	    for(int ele:arr){
	        System.out.print(ele+" ");
	    }
	}
}
