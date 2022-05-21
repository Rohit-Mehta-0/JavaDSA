package BinarySearchTree;


public class ValidBST {
    public static void main(String[] args) {
        Node root = null;
        isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

   public static boolean isValid(Node root, int minValue, int maxValue){
        if(root == null) return true;

        if(root.data <=minValue || root.data >= maxValue) return false;

        return isValid(root.left,minValue, root.data) && isValid(root.right,root.data, maxValue);
    }
}