package dsa.linkedlist;

public class LinkedList {
    /*
     * LinkedList has head and tail pointing to start and end
     * and each node  point to another node.
     * Tail points to null
     * In memory they are distributed, these does not have any indexes
     * Big O(n)---> n is no. of nodes
     *
     * */

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    //append method which will add a node at the end for empty linkedlist and with values

    public void append(int value) {

        Node newNode = new Node(value);
        //if empty
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //remove last node and return  for empty, one item and multiple values
    //we need to have pre and temp variables

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return pre;
    }


}
