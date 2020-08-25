package 第11回木;

public class TreeApp {
    public static void main(String[] args) {
        String[] data = { "Ymamot", "Takahashi", "Suzukjkdfpakjdpfai", "Tanaka", "Nakamura", "Watanabe", "Katoh",
                "Satoh", "Itoh", "helsinki", "kobayashi" };
        Tree t = new Tree(data[0]);
        for (int i = 1; i < data.length; i++) {
            t.add(data[i]);
        }
        t.print(t.getRoot());

        t.search("Tanaka");
        t.search("text");

    }
}