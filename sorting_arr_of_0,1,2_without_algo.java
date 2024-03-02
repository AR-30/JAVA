//SORTING AN ARRAY CONSISTING ONLY 0,1,2 WITHOUT SORTING ALGORITHM.

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array size ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements (0/1/2) ");
		int x=0,y=0,z=0;
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]==0)
		        x++;
		    else if(arr[i]==1)
		        y++;
		    else if(arr[i]==2)
		        z++;
		}
		int i=0;
		while(x>0){
		    arr[i]=0;
            i++;
            x--;
	    }
	    while(y>0){
	        arr[i]=1;
	        i++;
	        y--;
	    }
	    while(z>0){
	        arr[i]=2;
	        i++;
	        z--;
	    }
	    System.out.print("Sorted array : ")
	    for(int j=0; j<n; j++){
	        System.out.print(arr[j]+" ");
	    }
	}
}
