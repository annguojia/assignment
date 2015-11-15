package google.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ann on 10/31/15.
 */
public class Vector2D {

    private List<List<Integer>> vec2d;
    private static int row;
    private int r;
    private int c;

    public Vector2D( List<List<Integer>> vec2d ) {

        this.vec2d = vec2d;
        this.c = 0;
        this.r = 0;
        this.row = vec2d.size();


    }

    public int next() {
        int res  = 0;
        if (hasNext()) {
            if (vec2d.get(r) == null) {
                r++;
                c = 0;
                res = vec2d.get(r).get(c);
            } else {
                res = vec2d.get(r).get(c);
                c++;
                if (c >= vec2d.get(r).size()) {
                    r++;
                    c = 0;
                }
                return res;
            }

        }
        return -1;
    }

    public boolean hasNext() {
        if ( r >= 0 && r < row) {
            if ( (this.vec2d.get(r) == null && r < this.vec2d.size()) || (c >= 0 && c < this.vec2d.get(r).size())  )
                return true;
        }
        return false;
    }
    public void main() {
        List<List<Integer>> v = new ArrayList<>();
        Vector2D vec2d = new Vector2D(v);
        System.out.println();
    }
}
