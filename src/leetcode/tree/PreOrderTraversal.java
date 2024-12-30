package leetcode.tree;

public class PreOrderTraversal {

    public static void preOrderTraversal(BinarySearchTree.Node node){
        if(node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
