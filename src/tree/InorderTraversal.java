package tree;

public class InorderTraversal {

    public static void inOrderTraversal(BinarySearchTree.Node node){
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }
}
