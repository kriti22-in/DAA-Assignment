// LeetCode 33 - Search in Rotated Sorted Array
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Test 1 -> Index: " + search(nums1, 0)); // Expected: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Test 2 -> Index: " + search(nums2, 3)); // Expected: -1

        int[] nums3 = {1};
        System.out.println("Test 3 -> Index: " + search(nums3, 0)); // Expected: -1
    }
}
