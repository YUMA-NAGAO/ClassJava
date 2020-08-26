package 第12回ボイアムーア;

public class BoyerMoore {

    public void search(String text, String key) {
        int p = res(text, key);
        if (p != -1) {
            System.out.printf("見つかりました。pos=%d\n", p);

        } else {
            System.out.println("見つかりません。");
        }
    }

    public int res(String text, String key) {
        int[] skip = new int[256];
        int tlen = text.length();
        int klen = key.length();
        for (int i = 0; i < 256; i++) {
            skip[i] = klen;
        }

        for (int i = 0; i < klen - 1; i++) {
            skip[key.charAt(i)] = klen - 1 - i;
        }

        int tp;
        int kp;
        tp = klen - 1;
        while (tp < tlen) {
            System.out.printf("text=%s\n", text);
            System.out.printf("key =");
            for (int i = 0; i <= tp - klen; i++) {
                System.out.printf(" ");
            }
            System.out.printf("%s\n\n", key);
            kp = klen - 1;
            while (text.charAt(tp) == key.charAt(kp)) {
                if (kp == 0) {
                    return tp;
                }
                tp--;
                kp--;
            }

            tp += Math.max(skip[text.charAt(tp)], klen - kp);
        }

        return -1;
    }

}