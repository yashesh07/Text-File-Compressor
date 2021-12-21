package HuffmanCoding;

import java.io.*;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.IntStream;

public class FileManager {

    void createDirectory(String path){
        File theDir = new File(path);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }

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

    void writeFile(String text, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();
    }

    void createFile(String fileName, String extension){
        File compressedFile = new File(fileName + "." + extension);
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
        ObjectOutputStream outputStream;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(huffmanCodeBit);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String bitReader(String fileName) throws IOException {
        String encodedText = "";
        ObjectInputStream inputStream;
        try {
            inputStream = new ObjectInputStream(new FileInputStream(fileName));
            BitSet huffmanCodeBit = (BitSet) inputStream.readObject();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i<huffmanCodeBit.length(); i++)
                stringBuilder.append(huffmanCodeBit.get(i) ? "1" : "0");
            encodedText = stringBuilder.toString();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return encodedText;
    }

    void saveCodeTable(Map<Character, String> codeTable, String fileName) throws IOException {
        Properties properties = new Properties();
        for (Map.Entry<Character,String> entry : codeTable.entrySet()) {
            String key = entry.getKey().toString();
            properties.put(key, entry.getValue());
        }
        properties.store(new FileOutputStream(fileName), null);
    }

    Map<String, Character> loadCodeTable(String fileName) throws IOException {
        Map<String, Character> codeTable = new HashMap<>();
        Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
        for (String key : properties.stringPropertyNames()) {
            codeTable.put(properties.get(key).toString(), key.charAt(0));
        }
        return codeTable;
    }
}
