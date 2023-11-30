//Binary Search tree traversal

class Node{
        int key;
        Node left,right;
        Node(int item){
            key=item;
            left=right=null;
        }
    }
public class BST{
    Node root;
    BST(){
        root=null;
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + "->");
        }
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key + "->");
            inorder(root.right);
            
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.key + "->");
            preorder(root.left);
            preorder(root.right);
            
        }
    }
    public static void main(String args[]){
        BST tree = new BST();
        tree.root=new Node(1);
        tree.root.left=new Node(12);
        tree.root.right=new Node(9);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(6);
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.postorder(tree.root);
        System.out.print("\nPreorder traversal: ");
        tree.preorder(tree.root);
        
    }
}
