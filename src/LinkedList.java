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

    public Node removeFirst(){
        return new Node();
    }

    public Node removeLast(){
        Node temp;
        Node prev;

        prev = get(length - 2);
        temp = prev.next;
        temp.next = null;
        prev.next = null;

        return temp;
    }

    public Node get(int index){
        if(index< 0 || index >= length) return null;
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;

    }
    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;

        if (index == 0){
            //prepend(value);
            return true;
        }
        if(index == length){
            //append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return false;
    }

    public Node remove(int index){
        if(index  < 0 || index >= length) return null;
        if(index == 0 ) return removeFirst();
        if(index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length --;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
