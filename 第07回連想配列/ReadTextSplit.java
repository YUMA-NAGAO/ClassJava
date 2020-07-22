package 第07回連想配列;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextSplit {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("第07回連想配列/alice.txt"));

        String[] res = content.split(" ", 0);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }

    }
}