//Write a Program to reverse the Linked List. (Both Iterative and recursive)
//Iterative
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList l = new LinkedList();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            l.insertL(x);
        }
        l.reverse();
        l.display();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head = null;
    
    void insertL(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    void reverse(){
        Node t1 = null;
        Node t2 = head;
        Node t3 = null;
        while(t2!=null){
            t3 = t2.next;
            t2.next = t1;
            t1 = t2;
            t2 = t3;
        }
        head = t1;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
