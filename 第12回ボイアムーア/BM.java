package 第12回ボイアムーア;

public class BM {
    public static void main(String[] args) {
        String text = "National INstitute of Technology,nuaa Numazu College";
        String key = "Numazu";
        String sec = "sjkoj";
        BoyerMoore res = new BoyerMoore();
        res.search(text, key);

        res.search(text, sec);

    }

}