package dsa.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(12);
        myLinkedList.prepend(3);
        myLinkedList.prepend(4);
        myLinkedList.removeFirst();
        myLinkedList.insert(0, 888);

        myLinkedList.set(2, 777);

        System.out.println(myLinkedList.get(2).value);
        myLinkedList.printLinkedList();
        myLinkedList.revese();
        myLinkedList.printLinkedList();

        //System.out.println(myLinkedList.removeLast().value);
    }
}
