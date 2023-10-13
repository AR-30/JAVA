//linkedlist

import java.util.*;

class Node{
    int data;
    Node next;
}
public class SinglyLinkedList{
    static Node head;
    public static boolean isEmpty(){
        return(head==null);
    }
    public static void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }
    public static void insertLast(int data){
        if(isEmpty())
            insertFirst(data);
        else{
            Node current=head;
            Node newNode=new Node();
            while(current.next!=null)
                current=current.next;
            newNode.data=data;
            newNode.next=null;
            current.next=newNode;
        }
    }
    public static void insertAfterData(int dataAfter, int value){
        if(isEmpty()){ 
            System.out.println("List is empty, insertion not possible.");
            return;
        }
        else{
            Node temp=head;
            Node newNode=new Node();
            while(temp.next!=null && temp.data!=dataAfter)
                temp=temp.next;
            if(temp.next!=null){
                newNode.data=value;
                newNode.next=temp.next;
                temp.next=newNode;
            }
            else if(temp.data!=dataAfter)
                System.out.println("Node not present.");
            else{
                newNode.data=value;
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }
    public static void deleteFirst(){
        if(isEmpty()){ 
            System.out.println("List is empty, deletion not possible.");
            return;
        }
        System.out.println("Deleted data= "+head.data);
        head=head.next;
    }
    public static void deleteLast(){
        if(isEmpty()){ 
            System.out.println("List is empty, deletion not possible.");
            return;
        }
        else{
            Node temp=head;
            if(temp.next==null){
                head=null;
                return;
            }
            Node prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next; 
            }
            prev.next=null;
            System.out.println("Data deleted= "+temp.data);
        }
    }
    public static void deleteAfterData(int dataAfter){
        if(isEmpty()){ 
            System.out.println("List is empty, deletion not possible.");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.data!=dataAfter)
            temp=temp.next;
        if(temp.next!=null){
            System.out.println("Deleted data: "+temp.next.data);
            temp.next=temp.next.next;
        }
        else if(temp.data!=dataAfter)
            System.out.println("Node not present.");
        else
            System.out.println("Deletion not possible, since it is the last node.");
    }
    public static void displayList(){
        if(isEmpty()){ 
            System.out.println("List is empty, deletion not possible.");
            return;
        }
        else{
            System.out.print("List: ");
            for(Node current=head; current!=null; current=current.next){
                System.out.print(current.data+" ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){ 
            System.out.println("Choose operation :\n1:Insert at first\n2:Insert at last\n3:insert after data\n4:Delete at first\n5:Delete at last\n6:Delete after data\n7:Display\n8:Exit"); 
            int choice =sc.nextInt(); 
            switch(choice) { 
                case 1:
                    System.out.println("Enter the data :");
                    int data=sc.nextInt();
                    insertFirst(data);
                    break; 
                case 2: 
                    System.out.println("Enter the data :");
                    data=sc.nextInt();
                    insertLast(data);
                    break; 
                case 3: 
                    System.out.print("Enter data after which to be inserted: "); 
                    int dataAfter=sc.nextInt();
                    System.out.println("Enter the data to be entered :");
                    int value=sc.nextInt();
                    insertAfterData(dataAfter,value);
                    break; 
                case 4:
                    deleteFirst();
                    break; 
                case 5: 
                    deleteLast();
                    break; 
                case 6: 
                    System.out.print("Enter data after which to be deleted: "); 
                    dataAfter=sc.nextInt();
                    deleteAfterData(dataAfter);
                    break;
                case 7:
                    displayList();
                    break;
                case 8:
                    System.out.println("Program terminated!!");
                    return;
            }
		}
	}
}
