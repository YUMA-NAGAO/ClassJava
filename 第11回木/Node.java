package 第11回木;

public class Node {

    public static int count = 0;

    private String text;
    private Node left;
    private Node right;
    private int id;

    Node(String text) {
        setText(text);
        setLeft(null);
        setRight(null);
        setId(count++);

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
