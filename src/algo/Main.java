package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static final String EOL = System.getProperty("line.separator");

    public static void main(String[] args) {
        Node l = new Node(null, null, "l", 3);
        Node m = new Node(null, null, "m", 3);
        Node n = new Node(null, null, "n", 4);

        Node h = new Node(n, null, "h", 3);
        Node i = new Node(null, null, "i", 3);

        Node d = new Node(h, i, "d", 2);
        Node e = new Node(null, null, "e", 2);

        Node f = new Node(null, null, "f", 2);
        Node g = new Node(l, m, "g", 2);

        Node b = new Node(d, e, "b", 1);
        Node c = new Node(f, g, "c", 1);

        Node root = new Node(b, c, "root", 0);
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
        int currentLevel = 0;
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            int nodeLevel = node.getLevel();
            if (nodeLevel > currentLevel) {
                currentLevel = nodeLevel;
                System.out.print(EOL + node);
            } else {
                System.out.print(node);
            }

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
