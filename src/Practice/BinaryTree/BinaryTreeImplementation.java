package Practice.BinaryTree;

import java.util.*;

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
    public static int  heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1;
    }
    public static void levelOrderTraversal(Node root){
        int height = heightOfBinaryTree(root);

        for(int i=1; i<=height; i++){
            printCurrentLevel(root,i);
        }
    }

    public static void printCurrentLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data+ " ");
        }
        else if(level > 1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }

    }
    public static int sizeOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return (sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right)+1);
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
    public static ArrayList<Integer> postOrderTwo(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);
        while(!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.push(root);
            if(root.left != null){
                stack1.push(root.left);
            }
            if(root.right != null){
                stack1.push(root.right);
            }

        }

        while(!stack2.isEmpty()){
            root = stack2.pop();
            list.add(root.data);
        }
        return list;
    }

    public static ArrayList<Integer> levelOrderTraversalUsingQueue(Node root){
        ArrayList<Integer> list = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            root = q.poll();
            list.add(root.data);

            if(root.left != null){
                q.add(root.left);
            }
            if(root.right != null){
                q.add(root.right);
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
