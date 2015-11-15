package google.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ann on 11/6/15.
 * one of the onsite interview question in yelp
 * http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=101643&highlight=yelp%2B%C3%E6%BE%AD
 */
public class KeyIndex {
    public static List<Character>  Solution(List<List<Character>> lists, char index) {
        List<Character> res = new ArrayList<Character>();
        if (lists == null || lists.size() == 0) {
            return res;
        }
        HashMap<Character, List<Character>> mymap = new HashMap<Character, List<Character>>();

        for (List<Character> list : lists) {
//            List<Character> cur = new List<Character>(list);
            for (Character c : list) {
                List<Character> cur = new ArrayList<Character>(list);
                cur.remove(c);
                mymap.put(c,cur);
            }
        }
        return mymap.get(index);

    }
    public static void main(String[] args) {
        List<List<Character>> lists = new ArrayList<List<Character>>();
        List<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        lists.add(list);
        list =  new ArrayList<Character>();
        list.add('e');
        list.add('f');
        list.add('g');
        lists.add(list);
        list =  new ArrayList<Character>();
        list.add('h');
        list.add('i');
        list.add('j');
        lists.add(list);
        System.out.println(Solution(lists, 'j'));

    }
}
