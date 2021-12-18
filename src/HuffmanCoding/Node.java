package HuffmanCoding;

public class Node {

    char ch;
    int frequency;
    Node leftChild;
    Node rightChild;

    Node(int frequency){
        this.frequency = frequency;
    }

    Node(char ch, int frequency, Node leftChild, Node rightChild){
        this.ch = ch;
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    Node(int frequency, Node leftChild, Node rightChild){
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    boolean isLeaf(){
        return (leftChild==null && rightChild==null);
    }
}
