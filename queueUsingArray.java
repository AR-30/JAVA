import java.util.*;
public class Queue {
	  int SIZE = 5;
	  int items[] = new int[SIZE];
	  int front, rear;
	  Queue(){
	    front = 0;
	    rear = -1;
	  }	  
	  boolean isFull(){
	    if (front == 0 && rear == SIZE - 1) 
	      return true;
	    return false;
	  }
	  boolean isEmpty() {
	    if (front == -1)
	      return true;
	    else
	      return false;
	 }
	 void enqueue(int element) {
 		if (isFull())
	      	System.out.println("Queue is full");
	    else{
	        if (front == -1)
	             front = 0;
	        rear++;
	        items[rear] = element;
	        System.out.println("Insert " + element);
	    	}
	  }
	  int dequeue(){
	    int element;
	    if (isEmpty()){
	      System.out.println("Queue is empty");
	      return (-1);
	    }
	    else{
	      element = items[front++];
	      System.out.println( element + " Deleted");
	      return (element);
	    }
	  }
	   void display() {
	    int i;
	    if (isEmpty()) 
	      System.out.println("Empty Queue");
	    else {
	      System.out.println("\nFront index-> " + front);
	      System.out.println("Items -> ");
	      for (i = front; i <= rear; i++)
	        System.out.print(items[i] + "  ");
                System.out.println("\nRear index-> " + rear);
	    }
	  }
	 public static void main(String[] args) {
     	Queue Q = new Queue();
	    System.out.println("Initial Stack Empty : " + Q.isEmpty());
     	while(true){
            System.out.println("Enter 1: enqueue 2: dequeue 3:dsplay 4: exit");
	  		Scanner sc= new Scanner(System.in); 
	  		System.out.println("Enter the option ");
	  		int ch= sc.nextInt();
		    	switch(ch)
		    	{
		    	case 1: System.out.println("Enter the value to be inserted into Q");
		    			Scanner sc1= new Scanner(System.in); 
		    			System.out.println("Enter first element ");
		    			int val= sc1.nextInt();
		    			Q.enqueue(val);
		    			break;
		         case 2: Q.dequeue();
		              	 Q.display();
		               break;
		         case 3: Q.display();
		         break;
		    	case 4: 
		    	return;
		    	}
		    }
		}	    
	}
