package booking;

import java.util.Scanner;

/**
 * Created by ann on 11/5/15.
 */
public class Solution3 {

    //3. 给一堆数，比如 input ：25400 26300 2 128 5. output：25400 -128 900 -128 -26298 126 -123 题意 只要当前数减去前面数 -127<=diff<=127 就直接输出 diff， 如果不是先输出-128 在输出diff。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        int pre = -1;
        while (sc.hasNext()){
            String str = sc.next();
            int cur = Integer.parseInt(str);
            if (start && pre == -1 ) {
                start = false;
                System.out.println(cur);
                pre = cur;
            } else if (Math.abs(cur - pre) <= 127) {
                System.out.println(cur - pre);
                pre = cur;
            } else {
                System.out.println(-128);
                System.out.println(cur - pre);
                pre = cur;
            }
        }
    }
}
