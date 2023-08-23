package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrderTraversal(BinarySearchTree.Node root){
        Queue<BinarySearchTree.Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinarySearchTree.Node tempNode = queue.poll();
            System.out.println(tempNode.data);
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }
}
