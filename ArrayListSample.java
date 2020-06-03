import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("沼津市");
        list.add("長泉町");
        list.add("清水町");
        list.add("沼津高専");
        for (int i = 0; i < list.size(); i++) {
            println()
            System.out.println(list.get(i));
        }
    }

}