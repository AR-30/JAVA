//reversing linked list using recursion
import java.util.Scanner;
public class Main
{
    static class Node {
        int data;
        Node next;
        Node(int value) {
            this.data = value;
            this.next=null;
        }
    }
    static Node head=null;
    
    static Node reverse(Node curr){
        if(curr==null || curr.next==null)
            return curr;
        Node revlist = reverse(curr.next);
        curr.next.next=curr;
        curr.next=null;
        
        return revlist;
    }
    
    static void insertion(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
    }
    
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		    System.out.println("Enter choice:\n1:insertion\n2:reversal\n3:display\n4:exit");
		    int ch=sc.nextInt();
		    switch(ch){
		        case 1:
		            System.out.print("Enter data:");
		            int d=sc.nextInt();
		            insertion(d);
		            break;
                case 2:
                    head=reverse(head);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Program terminated!!");
                    return;
                default:
                    System.out.println("Enter correct choice.");
                    break;
		    }
		}
	}
}
