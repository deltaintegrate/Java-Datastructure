import BST.BinarySearchTree;
import Graph.Graph;
import Hash.HashTable;

import java.util.HashMap;

public class Main {

    public static void printItems(int n){
        for ( int i= 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static int addItems(int n){
        return n + n;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();

        LinkedList linklist = new LinkedList(4);


        Stack myStack = new Stack(4);
        myStack.push(5);
        myStack.push(15);
        myStack.push(25);
        myStack.push(45);
       myStack.pop();

       Queue myqueue = new Queue(7);
        myqueue.enQueue(8);
        myqueue.enQueue(6);
        myqueue.enQueue(3);
       myqueue.printQueue();
       myqueue.deQueue();
       myqueue.printQueue();

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(57);
        myBST.insert(69);
        myBST.insert(23);
        myBST.insert(17);

        System.out.println(myBST.contains(50));


        HashTable myHashTable = new HashTable(7);
        myHashTable.set("pollo", 100);
        myHashTable.set("Pato", 10);
        myHashTable.set("Vaca", 50);
        myHashTable.set("Leon", 120);
        myHashTable.set("Cerdo", 190);

        System.out.println(myHashTable.get("Cerdo"));


        System.out.println(myHashTable.keys());

        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B","C");
        myGraph.printGraph();



    }
}