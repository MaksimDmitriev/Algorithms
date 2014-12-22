package algo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
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

    /**
     * Write a function that takes the following inputs and gives the following outputs.
     *
     * Input: A list of points in 2-dimensional space, and an integer k
     * Output: The k input points closest to (5, 5), using Euclidean distance
     *
     * @param target
     * @param k
     * @return
     */
    static PriorityQueue<Point> findClosestPoint(Point target, int k) {
        Comparator<Point> comparator = new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                // TODO Auto-generated method stub
                return 0;
            }
        };
        PriorityQueue<Point> points = new PriorityQueue<Point>(0, comparator);
        // TODO:
        return points;
    }

}
