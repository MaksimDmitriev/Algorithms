package algo.printtree;

public class Node {

    private final Node left;
    private final Node right;
    private final String data;
    private final int level;

    public Node(Node left, Node right, String data, int level) {
        this.left = left;
        this.right = right;
        this.data = data;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

}
