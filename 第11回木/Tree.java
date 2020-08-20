package 第11回木;

public class Tree {

    private Node root;
    private static int count;

    Tree(String text) {
        root = new Node(text);
        count = 1;

    }

    public void add(String text) {
        Node t = new Node(text);
        Node p = root;
        Node old = null;

        while (p != null) {
            old = p;
            if (p.getText().compareTo(text) > 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        if (old.getText().compareTo(text) > 0) {
            old.setLeft(t);
        } else {
            old.setRight(t);

        }
        count++;
    }

    public Node search(String text) {
        Node p = root;
        while (p != null) {
            if (p.getText().equals(text) == true) {
                break;
            } else if (p.getText().compareTo(text) > 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        return p;
    }

    public void print(Node p) {
        int l, r;
        if (p != null) {
            print(p.getLeft());

            if (p.getLeft() != null) {
                l = p.getLeft().getId();
            } else {
                l = -1;
            }

            if (p.getRight() != null) {
                r = p.getRight().getId();
            } else {
                r = -1;
            }
            System.out.printf(" %4d --- %4d)%10s --- %4d\n", l, p.getId(), p.getText(), r);

            print(p.getRight());

        }
    }

    public int getCount() {
        return count;
    }

    public Node getRoot() {
        return root;
    }

}
