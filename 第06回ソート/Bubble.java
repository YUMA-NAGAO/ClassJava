package 第06回ソート;

public class Bubble {

    private int[] a;
    private int nElems;

    Bubble(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        a[nElems++] = value;
    }

    public void display() {
        int i;
        for (i = 0; i < nElems; i++) {
            System.out.println(a[i]);

        }
    }

    public void bubbleSort() {
        int out;
        int in;
        display();
        System.out.println("-------------");
        for (out = nElems - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    int tmp;
                    tmp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = tmp;
                }
            }
            display();
            System.out.println("-------------");

        }
    }

}