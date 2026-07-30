// LeetCode 35 - Search Insert Position
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // insertion point
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Test 1 -> Index: " + searchInsert(nums1, 5)); // Expected: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Test 2 -> Index: " + searchInsert(nums2, 2)); // Expected: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Test 3 -> Index: " + searchInsert(nums3, 7)); // Expected: 4
    }
}
