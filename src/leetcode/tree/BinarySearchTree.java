package leetcode.tree;

public class BinarySearchTree {

    //Represent a node of binary leetcode.tree
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent the root of binary leetcode.tree
    public Node root;

    public BinarySearchTree(){
        root = null;
    }

    //insert() will add new node to the binary search leetcode.tree
    public void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Check whether leetcode.tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the leetcode.tree
            Node current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of leetcode.tree
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of leetcode.tree
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        //Add nodes to the binary leetcode.tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        bt.insert(15);

        InorderTraversal.inOrderTraversal(bt.root);
       // PreOrderTraversal.preOrderTraversal(bt.root);
        //PostOrderTraversal.postOrderTraversal(bt.root);
        //LevelOrderTraversal.levelOrderTraversal(bt.root);
        //System.out.println(HeightOfBinaryTree.heightOfTree(bt.root));
    }
}
