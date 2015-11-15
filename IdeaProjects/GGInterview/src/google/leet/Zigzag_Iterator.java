/**
 * Created by ann on 10/29/15.
 */
//public class ZigzagIterator {
//    private int size;
//    private int ind1;
//    private int ind2;
//    private boolean position; // true for l1, false for l2
//    List<Integer> l1;
//    List<Integer> l2;
//    public ZigzagIterator(List<Integer> l1, List<Integer> l2) {
//        this.l1 = l1;
//        this.l2 = l2;
//        this.size = l1.size() + l2.size();
//        this.ind1 = 0;
//        this.ind2 = 0;
//        // fail to consider what is l1 is null and l2 is not null
//
//        this.position = true;
//    }
//    public boolean hasNext() {
//        if (ind1 >= l1.size() && ind2 >= l2.size()) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//    public int Next() {
//        int result = 0;
//        if (position) {
//            // l1
//            result = l1.get(ind1);
//            ind1++;
//            if (ind2 < l2.size() )
//                position = !position;
//
//        } else {
//            // l2
//            result = l2.get(ind2);
//            ind2++;
//            if (ind1 < l1.size() )
//                position = !position;
//        }
//        return result;
//    }

//}
