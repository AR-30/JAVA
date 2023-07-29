//finding square root till given decimal point.

import java.util.Scanner;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no.");
	    int n;
	    n=sc.nextInt();
	    System.out.println("Enter no. of decimal places");
	    int x;
	    x=sc.nextInt();
	    
	    double j=1,k=1;
	    double res=0;
	    for(int i=0; i<x; i++){
	        while(j*j<=n){
	            double y=j;
	            res=y;
	            j=j+k;
	        }
	        j=res;
	        k=k/10;
	    }
		System.out.println("Square root using direct function\n"+Math.sqrt(n));
		System.out.printf("Square root till given decimal place\n%."+x+"f\n",res);
	}
}
