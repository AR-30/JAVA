//stack - check balanced paranthesis or not

import java.util.Scanner;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		System.out.println("Enter parenthesis string");
		String str = sc.next();
		for(int i=0; i<str.length(); i++){
		    char present_char = str.charAt(i);
		    if(present_char == '(' || present_char == '[' || present_char == '{')
		        stack.push(present_char);
		    else if(present_char == ')' || present_char == ']' || present_char == '}'){
		        char top_element = stack.peek();
		        if(present_char == ')' && top_element == '(')
		            stack.pop();
		        else if(present_char == ']' && top_element == '[')
		            stack.pop();
		      
		        else if(present_char == '}' && top_element == '{')
		            stack.pop();
		        else{
		            System.out.println("Paranthesis are not balanced.");
		            return;
		        }
		    }
		    else
		        continue;
		}
		System.out.println("Paranthesis are balanced");
	}
}
