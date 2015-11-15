package google.leet;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ann on 11/1/15.
 */
public class PeekingIterator implements Iterator<Integer> {

    private int prenext;
    private boolean prehasNext;
    private Iterator<Integer> iter;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initializing any member here
        iter = iterator;
        prenext = iter.next();

    }

    public Integer peek() {
        return prenext;

    }

    @Override
    public Integer next() {
        int res = prenext;
        prenext = iter.hasNext() ? iter.next(): -1;
        return res;

    }

    @Override
    public boolean hasNext() {

        boolean prehasNext = iter.hasNext();
        return iter.hasNext();

    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        Iterator<Integer> iterator = nums.iterator();
        PeekingIterator pi = new PeekingIterator(iterator);
        while (pi.hasNext()) {
            System.out.println("before peek is:" + pi.peek());
            System.out.println("next is :" + pi.next());
            System.out.println("after peek is:" + pi.peek());
        }
    }
}
