//stack using array

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size of stack "); 
        int size=sc.nextInt(); 
        int[] stack = new int[size]; 
        int top=-1; 
        while(true){ 
            System.out.println("Choose operation :\n1:push()\n2:pop()\n3:display()\n4:exit"); 
            int choice =sc.nextInt(); 
            switch(choice) { 
                case 1: 
                    if(top==size-1) 
                        System.out.println("Stack Overflow"); 
                    else{ 
                         System.out.print("Enter element:"); 
                         int ele = sc.nextInt(); 
                         stack[++top]=ele; 
                    } 
                    break; 
                case 2: 
                    if(top==-1) 
                        System.out.println("Stack Underflow"); 
                    else 
                        System.out.println("Popped element = "+top--); 
                    break; 
                case 3: 
                    System.out.print("The stack contents are "); 
                    for(int i=top; i>-1; i--){ 
                        System.out.print(stack[i] + " "); 
                    }
                    System.out.println();
                    break; 
                case 4:
                    System.out.println("Program terminated!!");
                    return;
            } 
        } 
    } 
}
