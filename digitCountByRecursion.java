//number of digits in a integer.

import java.util.Scanner;

public class Main
{
    static int count(int n){
        if(n==0)
            return(0);
        int tempCount = 1 + count(n/10);
        return (tempCount);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int aCount = count(n);         //aCount=actual count;
		System.out.println(aCount);
	}
}
