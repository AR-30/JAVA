//factorial of a number.

import java.util.Scanner;

public class Main
{
    static int fact(int n){
        if(n==1)
            return(1);
        int tempFact = n*fact(n-1);
        return (tempFact);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int factorial = fact(n);
		System.out.println(factorial);
	}
}
