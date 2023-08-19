//SORTING ARRAYLIST OF ARRAYS USING COMPARATOR.

import java.util.*;

class ArrayComparator implements Comparator<int[]>{
    @Override
    public int compare(int[] arr1,int[] arr2){
        return Integer.compare(arr1.length, arr2.length);
        
    }
}

public class Main
{
    private static void printList(ArrayList<int[]> arr){
        for(int[] list:arr){
            for(int himanshi: list){
                System.out.print(himanshi+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<int[]> arr = new ArrayList<>();
		System.out.println("Input Array list Size");
		int size = sc.nextInt();
		for(int i=0; i<size; i++){
		    System.out.println("Input array Size");
		    int s = sc.nextInt();
		    int[] inputArray = new int[s];
		    for(int j=0; j<s; j++){
		         inputArray[j]=sc.nextInt();
		    }
		    //System.out.println("Array list size is "+arr.size());
		    arr.add(inputArray);
		}
		System.out.println("Entered ArrayList");
		printList(arr);
		Collections.sort(arr, new ArrayComparator());
		System.out.println("Sorted ArrayList");
		printList(arr);
    }
}
