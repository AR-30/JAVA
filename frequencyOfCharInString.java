//Given a string. Find the frequency of each character. 

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		int[] arr = new int[256];
		for(int i=0; i<str.length(); i++){
		    int asciiValue = str.charAt(i);
		    arr[asciiValue]++;
		}
		
		System.out.println("Result:");
		for(int i=0; i<256; i++){
		    if(arr[i]!=0){
		        System.out.println((char)i + " "+ arr[i]);
		    }
		}
	}
}
