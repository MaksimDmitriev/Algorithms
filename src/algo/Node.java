package algo;

public class Node {

    private final Node left;
    private final Node right;
    private final String data;

    public Node(Node left, Node right, String data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

}
