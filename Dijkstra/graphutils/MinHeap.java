public class MinHeap extends Heap {
    public MinHeap() {
    }
    @Override
    public boolean pairIsInCorrectOrder(Integer firstElement, Integer secondElement) {
        // returns true if first element is less than or equal to second element
        return compare.defaultCompareFunction(firstElement, secondElement) <= 0;
    }
}
