//Remove Duplicates in a sorted Linked List.

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList l = new LinkedList();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String x = sc.next();
            l.insertL(x);
        }
        l.duplicate();
        l.display();
    }
}

class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head = null;
    
    void insertL(String data){
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
    void duplicate(){
        Node t = head;
        while(t!=null && t.next!=null){
            if(t.data.equals(t.next.data)){
                t.next = t.next.next;
            }
            t = t.next;
            
        }
    }
    
    void display(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}


