//stack using linked list
import java.util.Scanner;
public class Main
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    static void pop(){
        if(head==null)
            System.out.println("Stack is empty, pop() not possible.");
        else{
            System.out.println("Deleted value: "+head.data);
            head=head.next;
        }
    }
    static void display(){
        if(head==null)
            System.out.println("Stack is empty.");
        else{
            Node temp=head;
            System.out.print("Stack: ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
		while(true){
		    System.out.println("Choose operation:\n1:push()\n2:pop()\n3:display\n4:exit");
		    int c=sc.nextInt();
		    switch(c){
		        case 1:
		            System.out.print("Enter data: ");
		            int value=sc.nextInt();
		            push(value);
		            break;
                case 2: 
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Program terminated!!");
                    return;
                default:
                    System.out.println("Enter valid choice");
		    }
		}
		
	}
}
