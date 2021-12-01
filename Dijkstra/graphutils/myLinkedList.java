import java.util.ArrayList;
import java.util.Collection;

public class myLinkedList {
    private LinkedListNode head;
    private int counter;

    public myLinkedList(Integer integer) {

    }

    public void append(Object data) {
        // incase the first element is null, initialize the node for this position
        if (head == null) {
            head = new LinkedListNode(data);
        }

        LinkedListNode nodeTemp = new LinkedListNode(data);
        LinkedListNode current = head;

        if (current != null) {
        // from the head, loop to the end of the list, then add after the last element present
            // while the reference to the next node is not null... make the current head the reference of the last node in the list
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // add new node to the last index of the list
            current.setNext(nodeTemp);
        }
        incrementCounter();
    }

    public int getCounter() {
        return this.counter;
    }

    public void incrementCounter() {
        counter++;
    }

    public void decrementCounter() {
        counter--;
    }

    public Object get(int index) {
        // returns item at the specified position in the list
        if (index < 0) {
            return null;
        }
        LinkedListNode current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current.getValue();
        }
        return current;
    }

    public boolean delete(int index) {
        // removes element at the specified position

        // if index is out of range..
        if (index < 1 || index > size()) {
            return false;
        }
        LinkedListNode current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return false;
                }
                current = current.getNext();
            }
            // pull back the elements in the list
            current.setNext(current.getNext().getNext());

            // decrement the number of elements
            decrementCounter();
            return true;
        }
        return false;
    }

    public int size() {
        return getCounter();
    }

    public Collection<LinkedListNode> toArray() {
        Collection<LinkedListNode> nodes = new ArrayList<>();

        LinkedListNode currentNode = this.head;
        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }

       return nodes;

    }


    // add element to a specific index

//    public void add(Object val, int index) {
//        //......
//    }


//    public Object find() {
//
//    }

//    public String toString() {
//        String output = "";
//        //.....
//        return output;
//    }

}
