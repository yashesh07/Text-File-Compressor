package HuffmanCoding;

public class check {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enQueue(new Node('r', 43, null, null));
        priorityQueue.enQueue(new Node('r', 4, null, null));
        priorityQueue.enQueue(new Node('r', 423, null, null));
        priorityQueue.enQueue(new Node('r', 431, null, null));
        priorityQueue.enQueue(new Node('r', 99, null, null));
        priorityQueue.enQueue(new Node('r', 76, null, null));
        priorityQueue.enQueue(new Node('r', 69, null, null));
        priorityQueue.enQueue(new Node('r', 543, null, null));
        priorityQueue.enQueue(new Node('r', 2, null, null));
        priorityQueue.enQueue(new Node('r', 413, null, null));
        priorityQueue.deQueue();
        priorityQueue.deQueue();
        priorityQueue.deQueue();
        priorityQueue.deQueue();
        System.out.println(priorityQueue.getLength());
        System.out.println(priorityQueue.getHead().priority);
    }
}
