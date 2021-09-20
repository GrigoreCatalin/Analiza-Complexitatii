public class SearchInRotatedSortedArray {


    public static int searchTarget(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static int searchPivot(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;


            if (middle > 0 && nums[middle] < nums[middle - 1]) {
                return middle;
            } else if (middle < nums.length - 1 && nums[middle] > nums[middle + 1]) {
                return middle;
            }

            if (nums[middle] > nums[left]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 3;

        int pivot = (searchPivot(nums, target));

        if (pivot == -1) {
            int result = searchTarget(0, nums.length - 1, nums, target);
            System.out.println(result);
        } else if (target == nums[pivot]) {
            int result = pivot;
            System.out.println(result);
        } else if (target <= nums[nums.length - 1]) {
            int result = searchTarget(pivot + 1, nums.length - 1, nums, target);
            System.out.println(result);
        } else {
            int result = searchTarget(0, pivot - 1, nums, target);
            System.out.println(result);
        }
    }
}