package google.leet;

import java.util.HashMap;

/**
 * Created by ann on 10/30/15.
 */
public class LongestConsecutiveSequence {
    public int LongestConsecutiveSequence (int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int left = map.containsKey(nums[i] - 1) ? map.get(nums[i] - 1): 0;
                int right = map.containsKey(nums[i] + 1) ? map.get(nums[i] + 1): 0;
                int sum = left + right + 1;
                map.put(nums[i], sum);
                max = Math.max(max, sum);
                map.put(nums[i] - left, sum);
                map.put(nums[i] + right, sum);
            }
        }
        return max;

    }
    public void main () {
        int[] A = {1, 100, 3, 4, 5, 2, 199, 343, 17};
        System.out.println(LongestConsecutiveSequence(A));
    }
}
