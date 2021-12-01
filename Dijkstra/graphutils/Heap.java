import java.util.*;

public abstract class Heap {
    ArrayList<Integer> heapContainer = new ArrayList<>();
    Comparator compare = new Comparator();

    // prevent direct instantiation of the heap class
    public Heap() {
      throw new AssertionError();
    }

    public Integer getLeftChildIndex(Integer parentIndex) {
        return (2 * parentIndex) + 1;
    }

    public Integer getRightChildIndex(Integer parentIndex) {
        return (2 * parentIndex) + 2;
    }

    public double getParentIndex(Integer childIndex) {
        return Math.floor((childIndex - 1) / 2);
    }

    public boolean hasParent(Integer childIndex) {
        return this.getParentIndex(childIndex) >= 0;
    }

    public boolean hasLeftChild(Integer parentIndex) {
        return this.getLeftChildIndex(parentIndex) < this.heapContainer.size();
    }

    public boolean hasRightChild(Integer parentIndex) {
        return this.getRightChildIndex(parentIndex) < this.heapContainer.size();
    }

    public Integer leftChild(Integer parentIndex) {
        return this.heapContainer.get(this.getLeftChildIndex(parentIndex));
    }

    public Integer rightChild(Integer parentIndex) {
        return this.heapContainer.get(this.getRightChildIndex(parentIndex));
    }

    public Integer parent(Integer childIndex) {
        Integer parentIndex = (int)this.getParentIndex(childIndex);
        return this.heapContainer.get(parentIndex);
    }

    public void swap(Integer indexOne, Integer indexTwo) {
        Integer tmp = this.heapContainer.get(indexTwo);
        this.heapContainer.set(indexTwo, this.heapContainer.get(indexOne));
        this.heapContainer.set(indexOne, tmp);
    }

    public boolean isEmpty() {
        return this.heapContainer.size() == 0;
    }

    public String toString() {
        return this.heapContainer.toString();
    }

    // sort upwards
    public void heapifyUp(Integer customStartIndex) {
        if (customStartIndex != null) {
            Integer currentIndex = customStartIndex;
        }
        Integer currentIndex = this.heapContainer.size() - 1;

        while (this.hasParent(currentIndex) && !this.pairIsInCorrectOrder(this.parent(currentIndex), this.heapContainer.get(currentIndex))) {
            this.swap(currentIndex, (int)this.getParentIndex(currentIndex));
            currentIndex = (int)this.getParentIndex(currentIndex);
        }
    }

    // overloaded heapify up
    public void heapifyUp() {
        this.heapifyUp(null);
    }

    // sort downwards
    public void heapifyDown(Integer customStartIndex) {
        customStartIndex = 0;
        Integer currentIndex = customStartIndex;
        Integer nextIndex = null;

        while (this.hasLeftChild(currentIndex)) {
            if (this.hasRightChild(currentIndex) && this.pairIsInCorrectOrder(this.rightChild(currentIndex), this.leftChild(currentIndex))) {
                nextIndex = this.getRightChildIndex(currentIndex);
            } else {
                nextIndex = this.getLeftChildIndex(currentIndex);
            }

            if (this.pairIsInCorrectOrder(this.heapContainer.get(currentIndex), this.heapContainer.get(nextIndex))) {
                break;
            }
            this.swap(currentIndex, nextIndex);
            currentIndex = nextIndex;
        }
    }

    //overloaded heapify down
    public void heapifyDown() {
        this.heapifyDown(null);
    }


    public Integer peek() {
        if (this.heapContainer.size() == 0) {
            return null;
        }
        return this.heapContainer.get(0);
    }

    // fetch first
    public Integer poll() {
        if (this.heapContainer.size() == 0) {
            return null;
        }
        if (this.heapContainer.size() == 1) {
            return this.heapContainer.get(0);
        }

        Integer item = this.heapContainer.get(0);

        // move last element to head then heapify down
        this.heapContainer.set(0, this.heapContainer.get(this.heapContainer.size() - 1));
        this.heapifyDown();

        return item;
    }

    // add nodes onto the heap
    public Heap pile(Integer item) {
        this.heapContainer.add(item);
        this.heapifyUp();
        return this;
    }

    // remove nodes from the heap
    public Heap pluck(Integer item, Comparator compare) {
        // find number of items to remove
        Integer numberOfItemsToRemove = this.find(item, compare).size();

        for (int iteration = 0; iteration < numberOfItemsToRemove; iteration++) {
            // after each heapify process, item indices are being changed,
            // therefore we need to find the indices before
            Integer indexToRemove = this.find(item, compare).remove(0);

            // if we need to remove the last item, we just remove it directly since there's
            // no need to heapify afterwards
            if (indexToRemove == (this.heapContainer.size() - 1)) {
                this.heapContainer.remove(indexToRemove);
            } else {
                // move last element in heap to the vacant position
                heapContainer.set(indexToRemove, this.heapContainer.remove(this.heapContainer.size() - 1));

                // get parent
                Integer parentItem = this.parent(indexToRemove);
                // If there is no parent or parent is in correct order with the node
                // we're going to delete then heapify down. Otherwise heapify up.
                if (this.hasLeftChild(indexToRemove) && (!this.hasParent(indexToRemove) || this.pairIsInCorrectOrder(parentItem, this.heapContainer.get(indexToRemove)))) {
                        this.heapifyDown(indexToRemove);
                } else {
                    this.heapifyUp(indexToRemove);
                }
            }
        }

        return this;
    }

    public ArrayList<Integer> find(Integer item, Comparator compare) {
        ArrayList<Integer> foundItemIndices = new ArrayList<>();
        for (Integer itemIndex = 0; itemIndex < this.heapContainer.size(); itemIndex++) {
            if (compare.defaultCompareFunction(item, this.heapContainer.get(itemIndex)) == 0) {
                foundItemIndices.add(itemIndex);
            }
        }
        return foundItemIndices;
    }

    public boolean pairIsInCorrectOrder(Integer firstElement, Integer secondElement) {
        throw new RuntimeException("You have to implement heap pair comparison method for " + firstElement + " and " + secondElement + " values");
    }
}
