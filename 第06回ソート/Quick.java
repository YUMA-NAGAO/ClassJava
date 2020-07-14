package 第06回ソート;

public class Quick {
    private int[] a;
    private int nElems;

    Quick(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        a[nElems++] = value;
    }

    public void display(int l, int r) {
        int i;
        for (i = 0; i < nElems; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print("l=" + l + ",r=" + r + ",");

    }

    public void quickSort(int left, int right) {
        int pivot;
        int i;
        int j;
        System.out.println(left + "から" + right + "までソート");
        pivot = a[(left + right) / 2];

        display(left, right);
        System.out.println("pivot = " + pivot);
        i = left;
        j = right;
        for (;;) {
            while (a[i] < pivot) {
                i++;
            }
            while (pivot < a[j]) {
                j--;
            }
            if (i >= j) {
                break;
            }
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;

            i++;
            j--;
        }
        if (left < i - 1) {
            quickSort(left, i - 1);
        }
        if (j + 1 < right) {
            quickSort(j + 1, right);
        }

    }

}