//Level order tree traversal

import java.util.*;

class Node{
        int data;
        Node left,right;
        Node(int item){
            data=item;
            left=right=null;
        }
    }
public class LevelTreeTraversal{
    Node root;
    LevelTreeTraversal(){
        root=null;
    }
    void levelorder(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        Node flag=new Node(-1);
        q.add(flag);
        int l=0;
        System.out.print("Level 0 : ");
        while(!q.isEmpty()){
            Node value=q.poll();
            if(value==flag && !q.isEmpty()){
                System.out.print("\n");
                System.out.print("Level "+ ++l +" : ");
                q.add(flag);
                value=q.poll();
            }
            if(value.data!=-1)
                System.out.print(value.data+" ");
            if(value.left!=null)
                q.add(value.left);
            if(value.right!=null)
                q.add(value.right);
        }
    }
    public static void main(String args[]){
        LevelTreeTraversal tree = new LevelTreeTraversal();
        tree.root=new Node(5);
        tree.root.left=new Node(15);
        tree.root.right=new Node(30);
        tree.root.left.right=new Node(6);
        tree.root.right.left=new Node(7);
        tree.root.left.right.right=new Node(88);
        System.out.println("Level order traversal: ");
        tree.levelorder(tree.root);
    }
}
