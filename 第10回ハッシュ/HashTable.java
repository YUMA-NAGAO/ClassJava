package 第10回ハッシュ;

public class HashTable {
    final int size1 = 10;
    final int size2 = 15;
    int n;
    HashElem table[] = new HashElem[size2];

    HashTable() {
        n = 0;
        for (int i = 0; i < table.length; i++) {
            table[i] = new HashElem();
        }
    }

    public void insert(String k, String v) {
        int h = hash(k);
        if (table[h].empty != true) {
            while (h < size2) {
                if (table[h].empty == true) {
                    break;
                }
                h++;
            }
        }
        if (h < size2) {
            table[h].key = k;
            table[h].value = v;
            table[h].empty = false;
            n++;

        } else {
            System.out.println("テーブルがいっぱいです.");
            System.exit(1);

        }
    }

    public void search(String s) {
        int h = hash(s);
        if (table[h].key.equals(s) != true) {
            while (h < size2) {
                if (table[h].key.equals(s) == true) {
                    break;

                }
                h++;
            }
        }
        if (h < size2) {
            System.out.printf("見つかりました。 :%2d, %s,\t %s\n", h, table[h].key, table[h].value);
        } else {
            System.out.println("見つかりません");
        }
    }

    public void printHashTable() {
        System.out.println("*** ハッシュテーブル ***");
        for (int i = 0; i < size2; i++) {
            System.out.printf("%2d, %s,\t %s\n", i, table[i].key, table[i].value);
        }
        System.out.println("*********");
    }

    public int hash(String s) {

        return s.charAt(0) % size1;
    }
}