import java.util.*;

public class PriorityQueue extends MinHeap {

    HashMap<Integer, Integer> priorities = new HashMap<>();

    public PriorityQueue() {
        // a call to min heap constructor
        super();

        Comparator comparePriorities = new Comparator();
    }

    // add item to priority queue
    public PriorityQueue add(Integer item, Integer... priority) {
        this.priorities.put(item, 0);
        super.pile(item);
        return this;
    }

    // remove item from priority queue
    public PriorityQueue remove(Integer item, Comparator compare) {
        super.pluck(item, compare);
        this.priorities.remove(item);
        return this;
    }

    // find item by value
    public ArrayList findByValue(Integer item){
        return this.find(item, compare);
    }

    // check if item already exists in a queue
    public boolean hasValue(Integer item) {
        return this.findByValue(item).size() > 0;
    }

    public PriorityQueue changePriority(Integer item, Integer newPriority) {
        this.remove(item, compare);
        this.add(item, newPriority);
        return this;
    }

    public Integer comparePriority(Integer a, Integer b) {
        if (this.priorities.get(a) == this.priorities.get(b)) {
            return 0;
        }
        return this.priorities.get(a) < this.priorities.get(b) ? -1 : 1;
    }
}
