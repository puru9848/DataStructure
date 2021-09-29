import org.w3c.dom.Node;

public class BinaryTreeModel {

    private int root;
    private Node leftNode;
    private Node rightNode;


    public BinaryTreeModel(int root, Node leftNode, Node rightNode) {
        this.root = root;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
