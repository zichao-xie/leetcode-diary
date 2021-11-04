import java.util.Iterator;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/4 21:31
 * @number 284
 */
class PeekingIterator implements Iterator<Integer> {
    /**
     * @author  xzc
     * @date  2021/11/4 21:38
     * @time  100
     * @memory  73.41
     * @description  挺迷茫的。。。
     */
    Iterator<Integer> iter;
    Integer next;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        next = iter.next();

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int ans = next;
        next = iter.hasNext()?iter.next():null;
        return ans;
    }

    @Override
    public boolean hasNext() {
        return next!=null;
    }
}
