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

        return temp;
    }
//prepand when no items, multiple items

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    //remove first item and return, when we have one  item, multiple and null

    public Node removeFirst() {
        if (length == 0) return null;

        //set a temp variable as we have to return it
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        //when we have one item
        if (length == 0) {
            tail.next = null;
        }
        return temp;
    }

    //get node at an index, we cannot get index before 0 and greater than length
    public Node get(int index) {

        if (index < 0 || index >= length) return null;

        //return
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        //variable where we set value
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;

    }

    public boolean insert(int index, int value) {

        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    //reverse inplace

    public void revese() {
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
