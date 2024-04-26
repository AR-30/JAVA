//Given an excel sheet row or column value, you have to find out the value in decimal. For example, A -> 1, AB -> 28, ADD -> 784.

import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Enter the string");
	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    String str = input.toUpperCase();
	    System.out.println("Entered string "+str);
	    double res=0;
	    int pow=0;
	    for(int i=str.length()-1; i>=0; i--){
	        for(int j=0; j<s.length(); j++){
	            if(str.charAt(i)==s.charAt(j)){
	                res=res+Math.pow(26,pow)*(j+1);
	                pow++;
	            }
	        }
	    }
	    System.out.println(res);
	    
	}
}
