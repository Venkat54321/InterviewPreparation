package tree;

public class BinarySearchTree {

    //Represent a node of binary tree
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

    //Represent the root of binary tree
    public Node root;

    public BinarySearchTree(){
        root = null;
    }

    //insert() will add new node to the binary search tree
    public void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Node current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
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
        //Add nodes to the binary tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        bt.insert(15);

       // InorderTraversal.inOrderTraversal(bt.root);
       // PreOrderTraversal.preOrderTraversal(bt.root);
        //PostOrderTraversal.postOrderTraversal(bt.root);
        //LevelOrderTraversal.levelOrderTraversal(bt.root);
        System.out.println(HeightOfBinaryTree.heightOfTree(bt.root));
    }
}
