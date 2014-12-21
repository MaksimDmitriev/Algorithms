package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Node l = new Node(null, null, "l");
        Node m = new Node(null, null, "m");
        Node n = new Node(null, null, "n");
        Node h = new Node(n, null, "h");

        Node i = new Node(null, null, "i");

        Node d = new Node(h, i, "d");
        Node e = new Node(null, null, "e");

        Node f = new Node(null, null, "f");
        Node g = new Node(l, m, "g");

        Node b = new Node(d, e, "b");
        Node c = new Node(f, g, "c");

        Node root = new Node(b, c, "root");
        printTree(root);
    }

    /*
     *           a
     *          /  \
     *         b    c
     *        / \   /\
     *       d  e  f  g
     *      /\        /\
     *     h  i       l m
     */
    /**
     * A binary tree represent an organization hierarchy.
     * The root node is the CEO and etc. design a algorithm to print the tree level by level.
     * TODO: start a new line when starting a new level
     */
    static void printTree(Node root) {
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            System.out.print(node);

            Node left = node.getLeft();
            if (left != null) {
                nodes.add(left);
            }
            Node right = node.getRight();
            if (right != null) {
                nodes.add(right);
            }
        }
    }

}
