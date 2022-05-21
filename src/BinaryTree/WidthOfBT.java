package BinaryTree;

import static BinaryTree.Implementation.createBinaryTree;

public class WidthOfBT {
    public static void main(String[] args) {
        Node root = createBinaryTree();
        System.out.println(width(root));
    }

    static int width(Node root){
        if(root == null){
            return 0;
        }
        int w1 = width(root.left);
        int w2 = width(root.right);
        int w3 = height(root.left) + height(root.right)+1;

        return Math.max(w1,Math.max(w2,w3));
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
}
