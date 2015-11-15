package google.leet;

import java.util.*;

/**
 * Created by ann on 11/4/15.
 */
public class RemoveInvalidParentheses {
    /**
     * new idea got inspired from Leetcode
     */
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return res;
        }
        Queue<String> strs = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();

        strs.offer(s);
        visited.add(s);
        while(!strs.isEmpty()) {
            int size = strs.size();
            for (int i = 0; i < size; i++) {
                String cur = strs.poll();
                if(isValid(cur)) {
                    res.add(cur);
                    visited.add(cur);

                } else {
                  for (int j = 0; j < cur.length(); j++) {
                      if (cur.charAt(j) != '(' && cur.charAt(j) != ')') {
                          continue;
                      }
                      String add = cur.substring(0, j) + cur.substring(j + 1);
                      if (!visited.contains(add)) {
                          strs.add(add);
                          visited.add(add);
                      }
                  }
                }
            }

        }
        return res;
    }

    private boolean isValid(String cur) {
        return true;
    }
    /**
     * not working currently for DFS
     */
//    public List<String> removeInvalidParentheses(String s) {
//        List<String> res = new ArrayList<String>();
//        String path = "";
//        helper(res, path, s, 0);
//        return res;
//    }

//    private void helper(List<String> res, String path, String s, int i) {
//        if (i >= s.length() ) {
//            res.add(new String(path));
//            return;
//        }
//        for (int j = i; i < s.length(); j++) {
//            if (isParentheses(s.charAt(j))) {
//
//            } else {
//                path = path + String.valueOf(s.charAt(j));
//            }
//        }
//    }
//
//    private boolean isParentheses(char c) {
//        if (c == '(' || c == ')' ) {
//            return true;
//        }
//        return false;
//    }
}
