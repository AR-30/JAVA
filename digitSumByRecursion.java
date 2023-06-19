//sum of digits of a number.

import java.util.Scanner;

public class Main
{
    static int sum(int n){
        if(n==0)
            return(0);
        int tempSum = n%10 + sum(n/10);
        return (tempSum);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int total = sum(n);
		System.out.println(total);
	}
}
