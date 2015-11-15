package booking;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by ann on 11/5/15.
 */
public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.hasNext() ? Integer.parseInt(sc.nextLine().trim().split(" ")[0]) : - 1;

        while (sc.hasNext()) {
            // what if cur 3 2
            String cur = sc.nextLine();
            String[] arrCur = cur.split(" ");
            int output = 1;// default 1 is false, 0 is true

            Set<Integer> map = new HashSet<Integer>();
            for (int i = 0; i < arrCur.length; i++) {
                int n = Integer.parseInt(arrCur[i]);
                if (map.contains(n)) {
                    output = 0;
                } else {
                    map.add(target - n);
                }
            }
            System.out.println(output);

        }
    }

}
