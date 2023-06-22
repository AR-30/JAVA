//greatest digit in a integer.

import java.util.Scanner;

public class Main
{
    static int maximum(int n){
        if(n<100)
            return(Math.max(n/10,n%10));
        int greatest = Math.max(n%10,maximum(n/10));
        return (greatest);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int res = maximum(n);
		System.out.println(res);
	}
}
