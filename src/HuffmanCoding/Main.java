package HuffmanCoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        new HuffmanEncoder("100MB.txt").compressFile();
    }
}
