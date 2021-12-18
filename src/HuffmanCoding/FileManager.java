package HuffmanCoding;

import java.io.*;
import java.util.BitSet;

public class FileManager {

    String readFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            br.close();
            return sb.toString();
        }
    }

    void createFile(String fileName){
        File compressedFile = new File(fileName + ".dopa");
        try {
            if (compressedFile.createNewFile()) {
                System.out.println("File created: " + compressedFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    void bitWriter(String data, String fileName) throws IOException {
        BitSet huffmanCodeBit = new BitSet(data.length());

        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '1')
                huffmanCodeBit.set(i);
        }
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(huffmanCodeBit);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
