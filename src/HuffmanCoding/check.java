package HuffmanCoding;

import java.io.IOException;

public class check {
    public static void main(String[] args) {
        try {
            String str = new FileManager().readFile("test.txt");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
