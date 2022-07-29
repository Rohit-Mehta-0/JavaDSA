package Practice.BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeImplementation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
            Node root = createBinaryTree();

            System.out.print("Preorder : ");
            preOrderRecursion(root);
            System.out.println();

            System.out.print("Postorder : ");
            postOrderRecursion(root);
            System.out.println();

            System.out.print("Inorder : ");
            inOrderRecursion(root);
            System.out.println();
            System.out.println(inorder(root));
    }

    public static Node createBinaryTree(){
        System.out.print("Enter Data: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if(data == -1){
            return null;
        }
        System.out.println("for the left of "+data);
        newNode.left = createBinaryTree();

        System.out.println("for the right of "+data);
        newNode.right = createBinaryTree();

        return newNode;
    }

    public static void preOrderRecursion(Node root) {

        if(root == null){
            return;
        }

        System.out.print(root.data+ " ");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    public static void postOrderRecursion(Node root){
        if(root == null){
            return;
        }
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data+ " ");
    }
    public static void inOrderRecursion(Node root){
        if(root == null){
            return;
        }
        inOrderRecursion(root.left);
        System.out.print(root.data+ " ");
        inOrderRecursion(root.right);
    }

    public static ArrayList<Integer> preorder(Node root){
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);

            if(root.right != null){
                root = root.right;
            }

            if(root.left != null){
                root = root.left;
            }
        }
        return list;
    }

    public static ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        while (true) {
            if(root != null){
                stack.push(root);
                root = root.left;
            }

            else{
                if(stack.isEmpty()) break;

                root = stack.pop();
                list.add(root.data);

                root = root.right;
            }
        }
        return list;
    }
}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
