package HuffmanCoding;

public class PriorityQueue {

    private QueueNode head;

    public void enQueue(Node n){
        QueueNode node = new QueueNode();
        node.next = null;
        node.priority = n.frequency;
        node.node = n;

        if(head==null || node.priority< head.priority){
            node.next = head;
            head = node;
        }
        else{
            QueueNode temp = head;
            while(temp.next!=null && temp.next.priority <= node.priority){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deQueue(){
        head = head.next;
    }

    public QueueNode getHead(){
        return head;
    }

    public  int getLength(){
        if (head==null) return 0;
        QueueNode temp = head;
        int i = 1;
        while(temp.next!=null){
            temp = temp.next;
            i++;
        }
        return i;
    }

}

class QueueNode{
    Node node;
    int priority;
    QueueNode next;
}