package algo.printtree;

import java.util.LinkedList;

public class BST {

    private final Node mRoot;

    public BST(int data) {
        mRoot = new Node(data);
    }

    public void insert(int data) {
        Node root = mRoot;
        while (((root.mData > data) ? (root.mLeft) : (root.mRight)) != null) {
            root = ((root.mData > data) ? (root.mLeft) : (root.mRight));
        }
        if (root.mData > data) {
            root.mLeft = new Node(data);
        } else {
            root.mRight = new Node(data);
        }
    }

    public void printTreeLevelbyLevel() {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(mRoot);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node head = null;
            while ((head = queue.remove()) != null) {
                System.out.print(head + " ");
                if (head.mLeft != null) {
                    queue.add(head.mLeft);
                }
                if (head.mRight != null) {
                    queue.add(head.mRight);
                }
            }
            System.out.println();
            if (!queue.isEmpty()) {
                queue.add(null);
            }
        }
    }
}
