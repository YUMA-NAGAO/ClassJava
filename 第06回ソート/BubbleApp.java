package 第06回ソート;

import java.util.Random;

public class BubbleApp {
    public static void main(String[] args) {
        int n = 5;
        Bubble app = new Bubble(n);
        Random rnd = new Random();
        for (int i = 0; i < n - 1; i++) {
            app.insert(rnd.nextInt());
        }
        app.bubbleSort();
    }

}