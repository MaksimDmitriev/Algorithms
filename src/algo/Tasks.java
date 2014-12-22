package algo;

import java.util.LinkedList;
import java.util.Queue;


public class Tasks {

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
                System.out.print(Main.EOL + node);
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
