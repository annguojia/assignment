package booking;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import java.lang.reflect.Array;
import java.util.*;


/**
 * Created by ann on 11/4/15.
 *
 */
public class Solution2 {

    // Using collections.sort to solve the necessary of 输出组内有序，且组间也有序，组之间是按照每组第一个string来排序
    public static List<List<String>> groupAnagram(List<String> strs ) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (strs == null || strs.size() == 0) {
            return res;
        }
        Collections.sort(strs);// 保证组内和组间有序
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            // prepocessing
            str = str.replaceAll(" ", "");
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sortStr = new String(strChar);

//            String sortStr = strChar.toString();
//            System.out.println(sortStr);
            if (map.containsKey(sortStr)) {
                map.get(sortStr).add(str);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(sortStr, list);
            }
        }
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            res.add(e.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("agree");
        strs.add("age   er");
        strs.add("garee");
        strs.add("ge rae");
        strs.add("str");
        strs.add("tsr");
        strs.add("rts");
        strs.add("ab");
        strs.add("ba");
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            String str = sc.next();
//            strs.add(sc.next());
////            System.out.println(str);
//        }
        System.out.println(groupAnagram(strs));


    }


}


