package 第07回連想配列;

import java.util.*;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        String[] gakkaj = { "機械", "電気電子", "電子制御", "制御情報", "物質"

        };
        String[] gakkae = { "M", "E", "D", "S", "C" };

        for (int i = 0; i < gakkae.length; i++) {
            map.put(gakkaj[i], gakkae[i]);
        }

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj + " = " + map.get(obj));
        }
    }
}