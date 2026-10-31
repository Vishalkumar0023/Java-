import java.util.*;
class Leetcode_219_hashMap {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> seen = new HashMap<>();
        int idx = 0;

        for (int i : nums) {

            if (seen.containsKey(i) &&
                Math.abs(idx - seen.get(i)) <= k) {

                return true;
            } else {
                seen.put(i, idx);
            }

            idx++;
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
