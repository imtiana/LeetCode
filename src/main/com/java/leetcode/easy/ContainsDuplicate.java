package main.com.java.leetcode.easy;

import java.util.Arrays;

/**
 * Time: N log N (NlogN for sorting + N comparisons)
 * Space: constant
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);

        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                return true;
            }
            last = nums[i];
        }

        return false;
    }

}
