package 第07回連想配列;

import java.util.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCount {
    public static void main(final String[] args) throws IOException {
        final String content = Files.readString(Paths.get("第07回連想配列/alice.txt"));
        final String[] words = content.split(" ", 0);

        final HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }

        }

        System.out.println(map);

    }

}