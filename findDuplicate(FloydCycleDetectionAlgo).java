// Given an array arr[] containing n integers where each integer is between 1 and (n-1) (inclusive). There is only one duplicate element, find the duplicate element in O(n) time complexity and O(1) space.

//Floyd’s Cycle Detection(also called Tortoise and Hare algo) - Time: O(N) , Space: O(1)

//explanation -> 
/*  using linkedlist.
    slow pointer moves one place at a time
    fast moves 2 places at a time
    if intersected => loop => duplicate present
    move fast ptr from intersection and slow ptr from arr[0], both 1 place at a time
    both will meet at the start ele of loop indicating the duplicate value
    this is mathematically proven
*/
    
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 1 };
        int n=arr.length;
        
        int slow=arr[0];
        int fast=arr[0];
        
        //finding intersection point
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        
        //finding loop entrance = duplicate value
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        //slow = fast = loop entrance = duplicate value
        System.out.print("Duplicate value -> "+slow);
    }
}
