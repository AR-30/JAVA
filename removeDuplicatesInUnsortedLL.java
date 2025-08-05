/*
 * Removes duplicates from an unsorted list using the two-pointer (runner) technique.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter the data for each node:");
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            l.insertL(x);
        }

        System.out.println("\nOriginal list:");
        l.display();
        l.removeDuplicates();
        System.out.println("\nList after removing duplicates:");
        l.display();
    }
}

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    void insertL(String data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data.equals(current.data)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("NULL");
    }
}
