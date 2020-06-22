package 第03回線形探索;

public class NodeTest {

    public static void main(String[] args) {
        NodeTest tes = new NodeTest();
        NodeList list = tes.new NodeList();
        String a = "AAA";
        String b = "BBB";
        String c = "CCC";
        String d = "DDD";
        String e = "EEE";
        String f = "FFF";

        list.insertFirst("{}".format(a));
        list.insertFirst("{}".format(b));
        list.insertFirst("{}".format(c));
        list.insertFirst("{}".format(d));
        list.insertFirst("{}".format(e));
        list.insertFirst("{}".format(f));
        list.displayNodeList();
        System.out.println(list.find("{}".format(c)));
        list.deleteFirst();
        list.displayNodeList();
        for (int z = 0; z < 5; z += 1) {
            list.deleteFirst();
        }
        list.displayNodeList();

    }

    class Node {
        // 属性
        String data;
        Node next;

        // メソッド
        // コンストラクタ
        Node(String s) {
            data = s;
            next = null;
        }

        // ノードを表示するメソッド
        public void displayNode() {
            System.out.print("{" + data + "}");
        }

    }

    class NodeList {
        Node first;

        NodeList() {
            first = null;
        }

        public boolean isEmpty() {
            if (first == null) {
                return true;
            } else {
                return false;
            }
        }

        public void insertFirst(String s) {
            Node newNode = new Node(s);
            newNode.next = first;
            first = newNode;
        }

        public Node deleteFirst() {
            Node temp = first;
            first = first.next;
            return temp;
        }

        public void displayNodeList() {
            System.out.print("リスト上のデータ -> ");
            Node current = first;
            while (current != null) {
                current.displayNode();
                current = current.next;
            }
            System.out.println();
        }

        public Node find(String key) {
            Node current = first;
            while (!current.data.equals(key)) {
                if (current.next == null) {
                    return null;
                } else {
                    current = current.next;
                }
            }
            return current;
        }

    }

}

// 参考リンク
// https://qiita.com/watanabk/items/738988fac29e1e1d8d88