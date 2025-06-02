//PROBLEM STATEMENT : Find the Union and Intersection of the two sorted arrays.

import java.util.*;

class Main {
    public static void main(String[] args) {
        //eg sorted arrays
        int[] arr1={-1,3,6,8};
        int[] arr2={3,4,6,7};
        
        //union and intersection of sorted arrays
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                union.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i]){
                union.add(arr2[j]);
                j++;
            }
            else{
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        //adding remaining elements
        while(i<arr1.length){
            union.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            union.add(arr2[j]);
            j++;
        }
        
        
        //printing resultant array
        System.out.print("Union -> ");
        for(int val:union){
            System.out.print(val+" ");
        }
        System.out.print("\nIntersection -> ");
        for(int val:intersection){
            System.out.print(val+" ");
        }
    }
}
