package Section9.AbstractClassChallenge;

public class BinaryTree {

    public Node root;

    public BinaryTree(int data) {
        this.root = new Node(data);
    }

    public BinaryTree() {
        this.root = null;
    }

    public Node insert(Node root,int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        else
        {
            if(data< root.data)
            {
                root.left=insert(root.left,data);  
            }
            else if(data>root.data)
                    {
                    root.right=insert(root.right,data);    
                    }
            return root;
        }

    }
    public static void main(String[] args) {
        BinaryTree binarytree=new BinaryTree();
        Node root=null;
        binarytree.insert(root, 50);
        binarytree.insert(root, 20);
        binarytree.insert(root, 30);
        binarytree.insert(root, 40);
        binarytree.insert(root, 32);
        binarytree.insert(root, 36);      
    }
}
