package Modul5.Latihan.Praktikum;

import java.util.Scanner;
import java.util.regex.Pattern;

// Class untuk node dalam binary tree
class Node {
    int key;
    String data;
    Node left, right;

    public Node(int key, String data) {
        this.key = key;
        this.data = data;
        left = right = null;
    }
}

// Class untuk binary tree
class BinaryTree {
    // Root dari binary tree
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method untuk melakukan traversal Preorder
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        // Proses root
        System.out.println(node.key + " " + node.data);

        // Proses child kiri
        preorderTraversal(node.left);

        // Proses child kanan
        preorderTraversal(node.right);
    }

    // Method untuk melakukan traversal Inorder
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        // Proses child kiri
        inorderTraversal(node.left);

        // Proses root
        System.out.println(node.key + " " + node.data);

        // Proses child kanan
        inorderTraversal(node.right);
    }

    // Method untuk melakukan traversal Postorder
    void postorderTraversal(Node node) {
        if (node == null)
            return;

        // Proses child kiri
        postorderTraversal(node.left);

        // Proses child kanan
        postorderTraversal(node.right);

        // Proses root
        System.out.println(node.key + " " + node.data);
    }

    // Method untuk memasukkan data ke dalam binary tree
    void insert(int key, String data) {
        root = insertNode(root, key, data);
    }

    // Method untuk memasukkan node ke dalam binary tree
    Node insertNode(Node root, int key, String data) {
        if (root == null) {
            root = new Node(key, data);
            return root;
        }

        if (key < root.key)
            root.left = insertNode(root.left, key, data);
        else if (key > root.key)
            root.right = insertNode(root.right, key, data);

        return root;
    }
}

public class CoffeeShopV2 {

    static BinaryTree kasir = new BinaryTree();
    int key = 10;

    void mainMenu(){
        System.out.println("A. Input data kasir.");
        System.out.println("B. Lihat data kasir.");
        System.out.print("Masukkan pilihan: ");
        Scanner input = new Scanner(System.in);
        char pilihMenu = input.next().charAt(0);
        switch (pilihMenu){
            case 'A':
                input.skip("[\r\n]");
                System.out.print("Masukkan Menu Yang Dipesan: ");
                String tempData = input.nextLine();
                inputData(tempData);
                break;
            case 'B':
                lihatData();
                break;
        }
    }

    void inputData(String data){

        kasir.insert(key, data);
        key = key + 10;
        mainMenu();
    }

    void lihatData(){
        System.out.println("Preorder Traversal:");
        kasir.preorderTraversal(kasir.root);

        System.out.println("\nInorder Traversal:");
        kasir.inorderTraversal(kasir.root);

        System.out.println("\nPostorder Traversal:");
        kasir.postorderTraversal(kasir.root);

        mainMenu();
    }

    public static void main(String[] args) {
        CoffeeShopV2 main = new CoffeeShopV2();

        main.mainMenu();
    }
}
