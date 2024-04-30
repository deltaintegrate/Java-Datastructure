package BST;

public class BinarySearchTree extends Node {
    public Node root;

    public BinarySearchTree(int value) {
        super(value);
    }
    public BinarySearchTree() {
        super();
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value){
       Node newNode = new BinarySearchTree(value);
       if(root == null){
           root = newNode;
           return true;
       }
       Node temp = root;
       while(true){
           if(newNode.value == temp.value) return false;
           if(newNode.value < temp.value){
               if(temp.left == null){
                   temp.left = newNode;
                   return true;
               }
               temp = temp.left;
           }
           if(newNode.value > temp.value){
               if(temp.rigth == null){
                   temp.rigth = newNode;
                   return true;
               }
               temp = temp.rigth;
           }
       }
    }

    public boolean print(){
        Node temp = root;
        while (temp != null){
            if(temp != null) {
                System.out.println(temp.value);
            }
            if(temp.rigth != null){
                System.out.print(temp.rigth.value);
            }
            if(temp.left != null){
                System.out.println(" "+temp.left.value);
            }
            return false;
        }
        return false;
    }

    public boolean contains(int value){
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.rigth;
            } else {
                return true;
            }
        }
        return false;
    }

}
