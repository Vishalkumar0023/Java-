import java.util.HashSet;
class Leetcode_217_hashSet {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String args[]) {
        int[] arr = {1, 4, 3, 5, 4};
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }
}