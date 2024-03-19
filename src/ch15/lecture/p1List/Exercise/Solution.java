package ch15.lecture.p1List.Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    List<List<Integer>> findMissing(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> missingInNums1 = new ArrayList<>();
        List<Integer> missingInNums2 = new ArrayList<>();

        for (int num : set2) {
            if (!set1.contains(num)) {
                missingInNums1.add(num);
            }
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                missingInNums2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(missingInNums1);
        result.add(missingInNums2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        Solution solution = new Solution();
        List<List<Integer>> result = solution.findMissing(nums1, nums2);

        System.out.println("Output: " + result);
    }
}
