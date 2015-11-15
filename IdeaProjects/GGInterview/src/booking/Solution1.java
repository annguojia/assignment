package booking;

/**
 * Created by ann on 11/4/15.
 */
//1. 给一些输入 比如 {4 4 4 4，6 5 6 5，1  2 3 4，1 1 1 1， 2 3 4 8}  每一项代表一个图形4个边的长度。 然后图形可能是正方形， 矩形，或者其他。 输出有几个正方形，矩形和其他。 比如我前面那个例子就输出 2 个正方形（因为4 4 4 4 和 1 1 1 1）， 1个矩形(6 5 6 5)，2个其他(1 2 3 4 和2 3 4 8)。
//
//

public class Solution1 {
    // check polygram
    public static void countPoly(String[] strs) {
        if (strs == null || strs.length == 0) {
            return;
        }
        int numSquare = 0, numRec = 0;
        for (String str : strs) {
            // str like 4 4 4 4
            String[] arr = str.split(" ");
            int l1 = 0, l2 = 0;
            l1 = Integer.parseInt(arr[0]);
            l2 = Integer.parseInt(arr[1]);
            if (Integer.parseInt(arr[2]) == l1 && Integer.parseInt(arr[3]) == l2) {
                if (l1 == l2 ) {
                    numSquare++;
                } else {
                    numRec++;
                }
            }
        }
        System.out.println("The number of Square in this array is: " + numSquare);
        System.out.println("The number of Rectangle in this array is: " + numRec);
        System.out.println("The number of Others in this array is: " + (strs.length - numSquare - numRec));

    }

    public static void main(String[] args) {
        String[] strs = {"4 4 4 4", "6 5 6 5","3 3 3 3", "1 2 3 4"};
        countPoly(strs);

    }

}
