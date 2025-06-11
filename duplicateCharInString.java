//Find Duplicate characters in a string

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="hello everyone";
	    
	    char[] arr=s.toCharArray();
	    Arrays.sort(arr);
	    
	    int count=1;
	    for(int i=0; i<arr.length-1; i++){
	        while(arr[i]==arr[i+1]){
	            count++;
	            i++;
	        }
	        if(count>1){
	            System.out.println(arr[i]+" count = "+count);
	        }
	        count=1;
	    }
		
	}
}
