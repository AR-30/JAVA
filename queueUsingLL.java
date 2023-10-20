//queue using linked list
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
    static Node front=null, rear=null;
    static void enqueue(int data){
        Node newNode = new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    static void dequeue(){
        if(front==null)
            System.out.println("Queue is empty, dequeue() not possible.");
        else{
            System.out.println("Deleted value: "+front.data);
            front=front.next;
        }
    }
    static void display(){
        if(front==null)
            System.out.println("Queue is empty.");
        else{
            Node temp=front;
            System.out.print("Queue: ");
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
		    System.out.println("Choose operation:\n1:enqueue()\n2:dequeue()\n3:display\n4:exit");
		    int c=sc.nextInt();
		    switch(c){
		        case 1:
		            System.out.print("Enter data: ");
		            int value=sc.nextInt();
		            enqueue(value);
		            break;
                case 2: 
                    dequeue();
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
