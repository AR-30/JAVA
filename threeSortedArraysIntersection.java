//FINDING COMMON ELEMENTS OF 3 SORTED ARRAYS

//METHOD 1 - FINDING INTERSECTION OF 2 ARRAYS AT A TIME
//METHOD 2 - DIRECT INTERSECTIONS OF 3 ARRAYS

//METHOD 1 -

import java.util.Arrays;
public class Main
{
    public static int[] intersection(int[] x, int[] y){
        
        int m=x.length;
        int n=y.length;
        int l=Math.min(m,n);
        int[] result=new int[l];

        int i=0,j=0,k=0;
        while(k<l && i<m && j<n){
            if (x[i] == y[j]) {
                result[k++] = x[i];
                i++;
                j++;
            } else if (x[i] < y[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return Arrays.copyOfRange(result, 0, k);
        
    }
    
	public static void main(String[] args) {
	    int[] arr1={1,4,6,7,9,12,15};
	    int[] arr2={2,5,7,9};
	    int[] arr3={3,5,8,9,12};
	    
	    int[] result = intersection(arr1,arr2);
	    result=intersection(arr3,result);
	    
	    System.out.println("Common element(s) of the 3 arrays - ");
	    for(int ele : result){
	        System.out.print(ele+" ");
	    }
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------
//MEHTOD 2 - 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 7, 9, 12, 15};
        int[] arr2 = {2, 5, 7, 9};
        int[] arr3 = {3, 5, 8, 9, 12};

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++; j++; k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        System.out.println("Common element(s) of the 3 arrays - ");
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
