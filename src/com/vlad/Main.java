package com.vlad;

public class Main {

    public static void main(String[] args) {
	    String str = "Here is a string for testing";
	    Solution solution = new Solution();

	    System.out.println("Initial string: "+str);
        str = solution.reverseOrder(str);
        System.out.println("Result string: " + str);

        BinaryTree tree = new BinaryTree();

        /*
        Binary binarytree is:
                  1
                /  \
               2    3
             /  \    \
            4   5     8
           / \  / \  / \
          6  7 6  7 6  7
         */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.right = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7);


        System.out.println("Maximum width is " + solution.maxWidth(tree.root));

    }
}
