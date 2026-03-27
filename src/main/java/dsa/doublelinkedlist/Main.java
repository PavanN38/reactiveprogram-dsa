package dsa.doublelinkedlist;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList myDoubleLinkedList = new DoubleLinkedList(10);

        myDoubleLinkedList.getHead();
        myDoubleLinkedList.getTail();
        myDoubleLinkedList.getLength();
        myDoubleLinkedList.append(17);
        myDoubleLinkedList.printDoubleLinkedList();
        System.out.println("after addition appending ");
        myDoubleLinkedList.removeLast();
        myDoubleLinkedList.printDoubleLinkedList();

        //System.out.println(myLinkedList.removeLast().value);
    }
}
