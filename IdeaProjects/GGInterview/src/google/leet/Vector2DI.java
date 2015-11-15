package google.leet;

import java.util.*;

/**
 * Created by ann on 10/31/15.
 */
public class Vector2DI {

    Queue<Iterator<Integer>> queue;
    Iterator<Integer> current = null;

    public Vector2DI (List<List<Integer>> vec2d) {

        queue = new LinkedList<Iterator<Integer>>();
        for (int i = 0; i < vec2d.size(); i++) {
            queue.offer(vec2d.get(i).iterator());
        }
        current = queue.poll();
    }

    public int next() {
        if (!current.hasNext()) {
            return -1;
        }
        return current.next();
    }

    public boolean hasNext() {
        if (current == null) {
            return false;
        }
        while (!current.hasNext()) {
            if (!queue.isEmpty()) {
                current = queue.poll();

            } else
                return false;

        }
        return true;
    }

    public static void main(String [ ] args) {
        List<List<Integer>> vec2d = new ArrayList<List<Integer>>();

//        List<Integer> ve = new ArrayList<Integer>();
        List<Integer> ve = null;
        ve.add(1);
        ve.add(2);
        ve.add(3);


        vec2d.add(ve);

        ve = new ArrayList<Integer>();
        vec2d.add(ve);

        ve = new ArrayList<Integer>();
        ve.add(4);
        ve.add(5);
        vec2d.add(ve);

        Vector2DI v = new Vector2DI(vec2d);
        while (v.hasNext()) {
            System.out.println(v.next());
        }
    }
}
