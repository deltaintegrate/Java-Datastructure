public class Stack  extends Node{
    private Node top;
    private int height;

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }


    public Stack(int value) {
        this.top = new Node(value);
        this.height = 1;

    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }
        newNode.next = top;
        top = newNode;
        height++;
    }

    public Node pop(){
        Node Temp = top;
        if(height == 0) return null;
        top = top.next;
        Temp.next = null;
        height--;
        return  Temp;
    }

    public void printStack(){
        Node temp = top;
        if(height == 0){
            return ;
        }
        for(int i =0 ; i < height ; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

}
