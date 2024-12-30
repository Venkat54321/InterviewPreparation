package leetcode.tree;

public class HeightOfBinaryTree {

    public static int heightOfTree(BinarySearchTree.Node root){
        if(root == null){
            return 0;
        }else {
            int lheight = heightOfTree(root.left);
            int rheight = heightOfTree(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);

        }
    }
}
