package 第05回探索;

public class SearchTest {
    public static void main(String[] args) {
        int arraydata = 5;
        SearchArray array1 = new SearchArray(arraydata);
        int i;
        int j = 1;
        for (i = 0; i < arraydata; i++) {
            array1.setData(i, j);
            j++;

        }
        System.out.println(array1.linerSearch(4));

        int arraydata1 = 50;
        SearchArray array2 = new SearchArray(arraydata1);
        i = 0;
        j = 1;
        for (i = 0; i < arraydata1; i++) {
            array2.setData(i, j);
            j++;

        }

        System.out.println(array2.binarySerach(20));

    }
}