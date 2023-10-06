//postfix evaluation
import java.util.*;
public class Evaluation{
    public static int evaluate(String exp){
        Stack<Integer> stack=new Stack<>();
        for(char c: exp.toCharArray()){
            if(Character.isDigit(c))
                Stack.push(c-'0');
            else{
                int op2=stack.pop();
                int op1=stack.pop();
                int result=applyOp(op1,op2,c);
                stack.push(result);
            }
        }
        return stack.pop();
    }

public static int applyOp(int op1,int op2,char c){
    switch(op){
        case '+':
            return op1+op2;
        case '-':
            return op1-op2;
        case '*':
            return op1*op2;
        case '/':
            if(op2==0)
                throw new ArithmeticException("Division by zero");
            return op1/op2;
        default:
            throw new IllegalArgumentException("Invalid operator: "+op);
    }
}
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter postfix exp ");
		String postfixExp=sc.nextLine();
		int res = evaluate(postfixExp);
		System.out.println("Result="+res);
	}
}

