public class LinkedList extends Node {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;

    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void removeFirst(){

    }

    public Node get(int index){
        if(index< 0 || index >= length) return null;
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
}
