package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    public static void main(String[] args) {
        Node root = null;
    }

    public static Node insert(Node root, int data){

        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        }
        else if(data > root.data){
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static ArrayList<Integer> levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();

        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
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

    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key ) return true;

        if(key < root.data) search(root.left, key);
        if(key > root.data) search(root.right, key);

        return false;
    }

    public static Node deleteNode(Node root, int key){
        if(root == null){
            return null;
        }

        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.data){
            root.right =  deleteNode(root.right, key);
         }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }

    static int minValue(Node root){
        int mini = root.data;
        while(root.left != null){
            mini = root.left.data;
            root = root.left;
        }
        return mini;
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
