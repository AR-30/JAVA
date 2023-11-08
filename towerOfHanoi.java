//tower of hanoi

import java.util.Scanner;

public class Main
{
    static int step=0;
    static void toh(int n, char s, char aux, char des){
        if(n==1){
            System.out.println("Move disk 1 from "+s+" to "+des);
            step++;
            return;
        }
        toh(n-1, s, des, aux);
        System.out.println("Move disk "+n+" from "+s+" to "+des);
        step++;
        toh(n-1, aux, s, des);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    toh(n,'A','B','C');
	    System.out.println("Steps = "+step);
	}
}
