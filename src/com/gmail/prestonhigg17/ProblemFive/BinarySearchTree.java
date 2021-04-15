package com.gmail.prestonhigg17.ProblemFive;

// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree
{

    /* Class containing left
       and right child of current node
     * and key value*/
    class Node
    {
        String key;
        Node left, right;
        int count;

        public Node(String item)
        {
            key = item;
            left = right = null;
            count = 1;
        }

        public String getKey()
        {
            return key;
        }

        public void addCount()
        {
            count++;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree()
    {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(String key)
    {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, String key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key) < 0)
        {
            root.left = insertRec(root.left, key);
        } else if (key.compareTo(root.key) > 0)
        {
            root.right = insertRec(root.right, key);
        }

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}
// adapted from Ankur Narain Verma
