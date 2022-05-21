package BinaryTree;

import java.util.*;

public class Implementation {
   static Scanner sc = null;
    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.print("PreOrder : ");
        preOrderRecursion(root);
        System.out.print("PreOrderIterative : ");
        System.out.println(preOrder(root));

        System.out.println();
        System.out.print("PostOrder : ");
        postOrderRecursion(root);
        System.out.print("PostOrderIterativeTwoStack: ");
        System.out.println(postOrderTwoStack(root));
        System.out.println();


        System.out.print("InOrder: ");
        inOrderRecursion(root);
        System.out.print("InOrderIterative: ");
        System.out.println(inOrder(root));

        System.out.print("Level Order Trversal : ");
        levelOrderTraversal(root);
        System.out.print("Level Order Traversal Queue");
        System.out.println(levelOrderTraversalUsingQueue(root));

        System.out.println("size: "+ SizeOfBinaryTree(root));
    }
    public static int SizeOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return SizeOfBinaryTree(root.left) + SizeOfBinaryTree(root.right)+1;
    }

    public static ArrayList<Integer> levelOrderTraversalUsingQueue(Node root){
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            list.add(root.data);

            if(root.left != null){
                queue.add(root.left);
            }
            if(root.right != null){
                queue.add(root.right);
            }
        }
        return list;

    }

    public static void levelOrderTraversal(Node root){
            int h = heightOfBinaryTree(root);
            for(int i=1; i<=h; i++){
                printCurrentLevel(root,i);
            }
    }

    public static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left) , heightOfBinaryTree(root.right)) + 1;
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

    public static ArrayList<Integer> postOrderTwoStack(Node root){
        if(root == null){
            return null;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        Stack<Node> stackOne = new Stack<>();
        Stack<Node> stackTwo = new Stack<>();

        stackOne.push(root);

        while(!stackOne.isEmpty()){
            root = stackOne.pop();
            stackTwo.push(root);

            if(root.left != null){
                stackOne.push(root.left);
            }
            if(root.right != null) {
                stackOne.push(root.right);
            }
        }

        while(!stackTwo.isEmpty()){
            list.add(stackTwo.pop().data);
        }
        return list;
    }

    public static ArrayList<Integer> preOrder(Node root){
        if(root == null){
            return null;
        }

        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return list;
    }
    public static ArrayList<Integer> inOrder(Node root){
        if(root == null){
            return null;
        }
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            if(root!= null){
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

    public static Node createBinaryTree(){
        sc = new Scanner(System.in);
        System.out.print("Enter data ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        Node newNode = new Node(data);
        System.out.println("for the left of "+ data);
        newNode.left = createBinaryTree();

        System.out.println("for the right of "+ data);
        newNode.right = createBinaryTree();

        return newNode;
    }

    public static void preOrderRecursion(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    public static void postOrderRecursion(Node root){
        if(root == null){
            return;
        }

        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrderRecursion(Node root){
        if(root == null){
            return;
        }

        inOrderRecursion(root.left);
        System.out.print(root.data + " ");
        inOrderRecursion(root.right);
    }

}
class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }

}
