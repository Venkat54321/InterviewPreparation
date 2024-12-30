package leetcode.tree;

public class PostOrderTraversal {

    public static void postOrderTraversal(BinarySearchTree.Node node){
        if(node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }
}
