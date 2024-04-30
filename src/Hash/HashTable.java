package Hash;


import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    private int size;
    private Node[] dataMap;

    public HashTable(int size){
        dataMap = new Node[size];
        this.size = size;
    }

    public void printTable(){
        for(int i=0; i< dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null){
                System.out.println("   {" + temp.key + "= " + temp.value + "}" );
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i =0; i  < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }


    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null){
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public  static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1){
            myHashMap.put(i, true);
        }
        for (int j : array2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

}
