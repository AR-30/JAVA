//find maximum product subarray

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = { -2, 6, -3, -10, 0, 2 };
		int n=arr.length;
		int maxProd=arr[0];
		for(int i=0; i<n; i++){
		    int currProd=1;
		    for(int j=i; j<n; j++){
		        currProd*=arr[j];
		        maxProd=Math.max(maxProd, currProd);
		    }
		}
		System.out.print(maxProd);
	}
}
