public class FindFirstAndLastPosition {

    public static int checkFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;

        while (left <= right) {
            int midd = left + (right - left) / 2;

            if (nums[midd] == target) {
                right = midd - 1;
                position = midd;
            } else if (nums[midd] > target) {
                right = midd - 1;
            } else {
                left = midd + 1;
            }
        }
        System.out.println(position);
        return position;
    }

    public static int checkLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;

        while (left <= right) {
            int midd = left + (right - left) / 2;

            if (nums[midd] == target) {
                left = midd + 1;
                position = midd;
            } else if (nums[midd] > target) {
                right = midd - 1;
            } else {
                left = midd + 1;
            }
        }
        System.out.println(position);
        return position;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int firstPosition = checkFirstPosition(nums, target);
        int lastPosition = checkLastPosition(nums, target);

        int[] result = new int[2];

        result[0] =firstPosition;
        result[1] =lastPosition;
    }
}
