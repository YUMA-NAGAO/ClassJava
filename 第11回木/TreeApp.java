package 第11回木;

public class TreeApp {
    public static void main(String[] args) {
        String[] data = { "Ymamot", "Takahashi", "Suzuki", "Tanaka", "Nakamura", "Watanabe", "Katoh", "Satoh", "Itoh",
                "kobayashi" };
        Tree t = new Tree(data[0]);
        for (int i = 1; i < data.length; i++) {
            t.add(data[i]);
        }
        t.print(t.getRoot());

        Node tmp = t.search("Tanaka");
        if (tmp != null) {
            System.out.printf("見つかりました。%s id=%d\n", tmp.getText(), tmp.getId());

        } else {
            System.out.println("見つかりません。");
        }
    }
}