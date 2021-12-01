public class LinkedListNode {
    // reference to the next node in the chain
    LinkedListNode next;

    // data carried by a node
    Object value;

    public LinkedListNode(Object v) {
        next = null;
        this.value = v;
    }

    // another Node constructor if we want to specify the node to point to.
    public LinkedListNode(Object v, LinkedListNode nextValue) {
        this.next = nextValue;
        this.value = v;
    }

    public Object getValue() {
        return value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode nextValue) {
        next = nextValue;
    }
}
