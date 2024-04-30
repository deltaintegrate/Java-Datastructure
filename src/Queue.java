public class Queue extends Node{
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        length++;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printQueue(){
        Node temp = first;
        if(length  == 0) return;
        for(int i =0; i < length; i++){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }
        last.next = newNode;
        last = newNode;
        length++;
    }

    public Node deQueue(){
        if (length == 0) return null;
        if(length == 1){
            first = null;
            last = null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }
}
