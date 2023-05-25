package Modul5.Latihan;

public class BinaryTree {

    public Node root;

    public void newNode(int data){
        root = newNode(root, new Node(data));
    }

    private Node newNode(Node root, Node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.left = newNode(root.left, newData);
        } else {
            root.right = newNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

}
