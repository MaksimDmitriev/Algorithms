package algo;

import org.junit.Test;

public class AlgoTests {

    @Test
    public void testPrintTree() {
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
        Tasks.printTree(root);
    }

}
