public class Comparator {


// if a compare function argument is passed
//    public Comparator(Integer compareFunction) {
//        this.compare() = compareFunction;
//    }

    public Comparator() {

    }


    // default comparison function
    public Integer defaultCompareFunction(Integer a, Integer b) {
        if (a == b) {
            return 0;
        }
        return a < b ? -1 : 1;
    }
}
