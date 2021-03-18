package bst;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree{

    Node root;
    public BinarySearchTree(){
        root = null;
    }
    void insert(int key){
        root = insertKey(root,key);
    }
    Node insertKey(Node root, int key){
        if (root == null)
        {
            Node a = new Node(key);
            root = a;
            return root;
        }

        if (key < root.data)
            root.left = insertKey(root.left, key);
        else if (key > root.data)
            root.right = insertKey(root.right, key);

        return root;
    }
    void inorder()
    {
        inorderTraverse(root);
    }
    void inorderTraverse(Node root)
    {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.print(root.data + "=>");
            inorderTraverse(root.right);
        }
    }
    void preorder()
    {
        preorderTraverse(root);
    }
    void preorderTraverse(Node root)
    {
        if (root != null) {
            System.out.print(root.data + "=>");
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }
    void postorder()
    {
        postorderTraverse(root);
    }
    void postorderTraverse(Node root)
    {
        if (root != null) {
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.print(root.data + "=>");
        }
    }

}
public class Create {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The no. of nodes of BST : ");
        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> tr = new HashSet<>();
        System.out.println("Enter The nodes of BST : ");
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            tr.add(Integer.parseInt(s[i]));
        }

        BinarySearchTree bst = new BinarySearchTree();
        Iterator<Integer> itr = tr.iterator();
        while(itr.hasNext()){
            bst.insert(itr.next());
        }
        bst.inorder();
        System.out.println();
        bst.preorder();
        System.out.println();
        bst.postorder();
    }
}
