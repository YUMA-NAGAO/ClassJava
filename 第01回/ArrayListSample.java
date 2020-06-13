package 第01回;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("沼津市");
        list.add("長泉町");
        list.add("清水町");
        list.add("沼津高専");
        output(list);
        list.add("裾野市");
        output(list);
        list.add(list.indexOf("沼津市") + 1, "三島市");
        output(list);
        list.set(list.indexOf("長泉町"), "ながいずみちょう");
        output(list);
        list.remove(list.indexOf("沼津高専"));
        output(list);
    }

    public static void output(ArrayList<String> list) {
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}