package dsa.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(12);
        myLinkedList.prepend(3);
        myLinkedList.printLinkedList();
        //System.out.println(myLinkedList.removeLast().value);
    }
}
