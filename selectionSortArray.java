//selction sort
import java.util.Scanner;
public class Main
{
    static void sort(int[] arr){
        int n=arr.length;
		for(int i=0; i<n-1; i++){
		    int min=i;
		    for(int j=i+1; j<n; j++){
		        if(arr[j]<arr[min])
		            min=j;
		    }
		    int temp=arr[i];
		    arr[i]=arr[min];
		    arr[min]=temp;
		}
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0; i<size; i++){
		    arr[i]=sc.nextInt();
		}
		sort(arr);
		System.out.print("Sorted array: ");
		for(int i=0; i<size; i++)
		    System.out.print(arr[i]+" ");
	}
}
