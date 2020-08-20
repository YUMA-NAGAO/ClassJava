package 第10回ハッシュ;

public class HashApp {
    public static void main(String[] args) {
        HashTable h = new HashTable();

        h.insert("SATO", "佐藤city");
        h.insert("SUZUKI", "鈴木city");
        h.insert("TAKAHASHI", "高橋city");
        h.insert("TANAKA", "田中city");
        h.insert("ITOH", "伊藤city");
        h.insert("WATANABE", "渡辺city");
        h.insert("YAMAMOTO", "山本city");
        h.insert("NAKAYAMA", "中村city");
        h.insert("KOBAYASHI", "小林city");
        h.insert("KATO", "000555555555");

        h.printHashTable();
        h.search("TANAKA");
        h.search("KATO");
    }
}