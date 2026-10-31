import java.util.*;
class Leetcode_219_HashSet {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k <= 0) return false;

        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (seen.contains(nums[i])) {
                return true;
            }

            seen.add(nums[i]);

            if (seen.size() > k) {
                seen.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Output: " + result);
    }
}
