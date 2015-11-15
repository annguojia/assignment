package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ann on 11/14/15.
 */
public class RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        String path = "";
        helper(res, path, s, 0, 4);
        return res;

    }
    public void helper (ArrayList<String> res, String path, String s, int index, int n) {

        if (index == s.length() && n == 0) {
            path = path.substring(0, path.length() - 1);
            res.add(path);
            return;
        } else if (index == s.length() || n == 0) {
            return;
        }
        for (int end = index + 1; end <= s.length() && end <= index + 3; end++) {
            int sub = Integer.parseInt(s.substring(index, end));
            if (sub <= 255) {
                helper(res, path + String.valueOf(sub) + ".", s, end, n - 1);
            }
        }

    }

    public static void main(String[] args) {
        RestoreIpAddresses rip = new RestoreIpAddresses();
        for (String str :rip.restoreIpAddresses("1308758")) {
            System.out.println(str);
        }

    }

}
