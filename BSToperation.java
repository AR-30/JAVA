//Binary Search tree

public class BST{
    class Node{
    int key;
    Node left,right;
    Node(int item){
        key=item;
        left=right=null;
    }
}
    Node root;
    BST(){
        root=null;
    }
    Node insert(Node root, int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insert(root.left, key);
        else if(key>root.key)
            root.right=insert(root.right, key);
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key + "->");
            inorder(root.right);
            
        }
    }
    Node delete(Node root, int key){
        if(root==null){
            return root;
        }
        if(key<root.key)
            root.left=delete(root.left, key);
        else if(key>root.key)
            root.right=delete(root.right, key);
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.key=minValue(root.right);
            root.right=delete(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root){
        int minv=root.key;
        while(root.left!=null){
            minv=root.left.key;
            root=root.left;
        }
        return minv;
    }
    public static void main(String args[]){
        BST tree = new BST();
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,3);
        tree.root=tree.insert(tree.root,1);
        tree.root=tree.insert(tree.root,6);
        tree.root=tree.insert(tree.root,7);
        tree.root=tree.insert(tree.root,10);
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.print("\nAfter deleting 6: ");
        tree.delete(tree.root, 6);
        System.out.print("\nInorder traversal: ");
        tree.inorder(tree.root);
        
    }
}
