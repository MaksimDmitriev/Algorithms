package algo.printtree;

public class Main {

    public static void main(String[] args) {
        // http://www.careercup.com/question?id=6311899375337472
        BST bst = new BST(100);
        bst.insert(10);
        bst.insert(5);
        bst.insert(70);
        bst.insert(1);
        bst.insert(7);
        bst.insert(6);
        bst.insert(8);
        bst.insert(150);
        bst.insert(120);
        bst.insert(170);
        bst.insert(110);
        bst.insert(125);

        bst.printTreeLevelbyLevel();
    }

}
