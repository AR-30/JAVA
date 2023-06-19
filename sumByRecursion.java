//sum of first 'n' numbers.

import java.util.Scanner;

public class Main
{
    static int sum(int n){
        if(n==1)
            return(1);
        int tempTotal = n + sum(n-1);
        return (tempTotal);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int total = sum(n);
		System.out.println(total);
	}
}
