//Find longest consecutive subsequence

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {2, 6, 1, 9, 4, 5, 3};
		int n=arr.length;
		Arrays.sort(arr);
        
        int result=0;
        int count=1;
		for(int i=1; i<n; i++){
		   if(arr[i]==arr[i-1]+1){
		       count++;
		   }else{
		       result=Math.max(result, count);
		       count=0;
		   }
		}
		System.out.print(result);
	}
}
