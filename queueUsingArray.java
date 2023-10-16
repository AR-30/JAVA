import java.util.Scanner;
class Queue {
	static int front, rear, capacity;
	static int queue[];
	Queue(int c){
		front = rear = -1;
		capacity = c;
		queue = new int[capacity];
	}
	static boolean isFull(){
	    if (rear == capacity - 1) 
	      return true;
	    return false;
	 }
	static boolean isEmpty() {
	    if (front == -1 || front>rear )
	      return true;
	    return false;
	}
	static void enqueue(int data){
		if (isFull()) {
			System.out.printf("\nCapacity exhausted, could not insert "+data+"\n");
		}
		else {
		    if(front==-1)
		        front++;
		    rear++;
			queue[rear] = data;
		}
		return;
	}
	static void dequeue(){
		int element;
	    if (isEmpty())
	      System.out.println("Queue is empty");
	    else{
	      element = queue[front++];
	      System.out.println( element + " Deleted");
	    }
	}
	void display() {
	    int i;
	    if (isEmpty()) 
	      System.out.println("Empty Queue");
	    else {
	        System.out.println("\nFront index-> " + front);
	        System.out.println("Queue -> ");
	        for (i = front; i <= rear; i++)
	            System.out.print(queue[i] + "  ");
            System.out.println("\nRear index-> " + rear);
	    }
	  }
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size of queue "); 
        int size=sc.nextInt();
     	Queue Q = new Queue(size);
	    System.out.println("Initial Stack Empty : " + Q.isEmpty());
     	while(true){
            System.out.println("Enter your choice\n1: enqueue\n2: dequeue\n3: display\n4: exit");
	  		int ch= sc.nextInt();
		    	switch(ch){
		    	case 1:
		    	    System.out.println("Enter the value to be inserted");
		    		int val= sc.nextInt();
		    		Q.enqueue(val);
		   			break;
		         case 2:
		             Q.dequeue();
		             break;
		         case 3:
		            Q.display();
		            break;
		    	case 4:
		    	    return;
		    	default:
		    	    System.out.println("Enter valid choice:");
		    	}
		    }
		}
}
