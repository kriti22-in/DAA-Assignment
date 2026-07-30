// LeetCode 162 - Find Peak Element
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid; // peak is on the left side (including mid)
            } else {
                left = mid + 1; // peak is on the right side
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1 -> Peak Index: " + findPeakElement(nums1)); // Expected: 2

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Test 2 -> Peak Index: " + findPeakElement(nums2)); // Expected: 1 or 5
    }
}
