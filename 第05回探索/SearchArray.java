package 第05回探索;

public class SearchArray {
    private int[] array;
    private int size;

    SearchArray(int s) {
        array = new int[s];
        size = s;
    }

    public void setData(int index, int data) {
        array[index] = data;
    }

    public int getData(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public int linerSearch(int data) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int binarySerach(int data) {
        int start = 0;
        int end = size - 1;
        int location = -1;
        int middle;

        while (start <= end && location == -1) {
            middle = Math.round((start + end) / 2);
            System.out.println("開始位置 = " + start + ", 中央位置 = " + middle + "終了位置 = " + end);

            if (array[middle] == data) {
                System.out.println("見つかりました");
                location = middle;
            } else if (array[middle] > data) {
                System.out.println("中央より左側にありそうです");
                end = middle - 1;

            } else {
                System.out.println("中央より右側にありそうです");
                start = middle + 1;
            }
        }
        return location;
    }

}