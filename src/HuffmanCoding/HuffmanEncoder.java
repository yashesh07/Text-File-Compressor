package HuffmanCoding;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HuffmanEncoder {

    private static final int ALPHABET_SIZE = 256;

    HuffmanEncoder(String file, String outputFile, String fileName) throws IOException {

        String fileData = new FileManager().readFile(file);
        int [] frequency = buildFrequencyDictionary(fileData);
        Node root = buildHuffmanTree(frequency);
        Map<Character, String> codeTable = getCodeTable(root);
        String encodedData = getEncodedData(fileData, codeTable);
        compressFile(outputFile, fileName, codeTable, encodedData);

    }

    private int [] buildFrequencyDictionary(String encodingFile){
        final int [] frequency = new int[ALPHABET_SIZE];
        for(final char character: encodingFile.toCharArray())
            frequency[character]++;
        return frequency;
    }

    private Node buildHuffmanTree(int [] frequency){
        PriorityQueue priorityQueue = new PriorityQueue();
        for(char i = 0; i<ALPHABET_SIZE; i++){
            if(frequency[i]>0)  priorityQueue.enQueue(new Node(i, frequency[i], null, null));
        }
        if(priorityQueue.getLength()==1){
            priorityQueue.enQueue(new Node(priorityQueue.getHead().priority, null, null));
        }
        while(priorityQueue.getLength()>1){
            Node node1 = priorityQueue.getHead().node;
            priorityQueue.deQueue();
            Node node2 = priorityQueue.getHead().node;
            priorityQueue.deQueue();
            priorityQueue.enQueue(new Node(node1.frequency+node2.frequency, node1, node2));
        }
        return priorityQueue.getHead().node;
    }

    private Map<Character, String> getCodeTable(Node root){
        Map<Character, String> codeTable = new HashMap<>();
        buildCodeTable(codeTable, "", root);
        return codeTable;
    }

    private void buildCodeTable(Map<Character, String> codeTable, String str, Node node){
        if(!node.isLeaf()){
            buildCodeTable(codeTable, str + '0', node.leftChild);
            buildCodeTable(codeTable, str + '1', node.rightChild);
        }
        else{
            codeTable.put(node.ch, str);
        }
    }

    private String getEncodedData(String file, Map<Character, String> codeTable){
        StringBuilder stringBuilder = new StringBuilder();
        for(char character: file.toCharArray()){
            stringBuilder.append(codeTable.get(character));
        }
        return stringBuilder.toString();
    }

    private void compressFile(String outputFile, String fileName, Map<Character, String> codeTable, String encodedData) throws IOException {

        new FileManager().createDirectory(outputFile);
        new FileManager().createFile(outputFile + "\\" + fileName, "dopa");
        new FileManager().createFile(outputFile + "\\" + fileName, "map");
        new FileManager().saveCodeTable(codeTable, outputFile + "\\" + fileName + ".map");
        new FileManager().bitWriter(encodedData, outputFile + "\\" + fileName + ".dopa");
    }

}
