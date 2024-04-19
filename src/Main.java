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
        System.out.println(addItems(10));


        HashMap<String, Integer> map1 = new HashMap<>();

        LinkedList linklist = new LinkedList(4);
        linklist.printList();

    }
}