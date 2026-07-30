import java.util.Arrays;

public class SortAnArray {

    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, left, temp.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 3, 1};
        System.out.println("Test 1 -> " + Arrays.toString(sortArray(nums1)));

        int[] nums2 = {5, 1, 1, 2, 0, 0};
        System.out.println("Test 2 -> " + Arrays.toString(sortArray(nums2)));
    }
}
