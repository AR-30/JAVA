//FINDING LCM

import java.util.Scanner;
import java.lang.Math;


public class Main
{
    public static int lcm(int n1, int n2){
        int max = Math.max(n1,n2);
        for (int i = max; ; i += max) {
            if (i % n1 == 0 && i % n2 == 0) {
                return i;
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter one number ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number ");
		int n2 = sc.nextInt();
		System.out.print("LCM = "+lcm(n1,n2));
	}
}
