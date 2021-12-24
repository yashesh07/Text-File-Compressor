package HuffmanCoding;

import java.io.IOException;
import java.util.Map;

public class HuffmanDecoder {

    HuffmanDecoder(String folder, String inputFileName, String outputFile) throws IOException {

        String textFile = folder + "\\" + inputFileName + ".dopa";
        String mapFile = folder + "\\" + inputFileName + ".map";
        Map<String, Character> codeTable = new FileManager().loadCodeTable(mapFile);
        String encodedData = new FileManager().bitReader(textFile);
        String decodedData = getDecodedData(encodedData, codeTable);
        decompressFile(outputFile, decodedData);

    }

    private String getDecodedData(String fileData, Map<String, Character> codeTable){
        StringBuilder stringBuilder = new StringBuilder();
        String temp = "";
        for(char character: fileData.toCharArray()){
            temp = temp + character;
            if(codeTable.containsKey(temp)){
                stringBuilder.append(codeTable.get(temp));
                temp = "";
            }
        }
        return stringBuilder.toString();
    }

    private void decompressFile(String outputFile, String decodedData) throws IOException {

        new FileManager().createFile(outputFile, "txt");
        new FileManager().writeFile(decodedData, outputFile + ".txt");
    }
}
