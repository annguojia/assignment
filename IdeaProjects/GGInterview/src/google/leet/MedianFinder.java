package google.leet;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
//import java.util.Queue;

/**
 * Created by ann on 10/31/15.
 */
public class MedianFinder {
    private  PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//    private  PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    // method 1: to use a comparator build-in comparator
    // method 2: to use a custom comparator
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(1000,
    new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    });

    // adds a number into data structure
    public void addNum(int num) {
        // add a new data into stream
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // modify the size of two heap
        if (maxHeap.size() - 1 > minHeap.size() ) {
            int cur = maxHeap.poll();
            minHeap.offer(cur);
        } else if (minHeap.size() - 1 > maxHeap.size()){
            int cur = minHeap.poll();
            maxHeap.offer(cur);
        }
    }
    // return the median of current data stream
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek())/2;
        } else if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        }  else return maxHeap.peek();

    }
}
