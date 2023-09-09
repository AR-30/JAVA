//FINDING HCF

import java.util.Scanner;
import java.lang.Math;


public class Main
{
    public static void hcf(int n1, int n2){
        int ans=1;
        while (n1%2==0 & n2%2==0){
            n1 /= 2;
            n2 /= 2;
            ans *= 2;
        }
        for (int i = 3; i <= Math.min(n1,n2); i+= 2){
            int count2=0;
            while (n1%i==0 & n2%i==0){
                n1 /= i;
                n2 /= i;
                ans *= i;
            }
        }
        System.out.print("\nHCF = "+ans);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter one number ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number ");
		int n2 = sc.nextInt();
		hcf(n1,n2);
	}
}
