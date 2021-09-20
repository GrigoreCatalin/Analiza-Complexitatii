public class Ex1 {

    public static int searchInsert(int[] nums, int target) {
        int startArray = 0;
        int endArray = nums.length - 1;
        int middleArray = -1;

        while (startArray <= endArray) {
            middleArray = (startArray + endArray) / 2;

            if (nums[middleArray] == target) {
                return middleArray;
            } else if (nums[middleArray] > target) {
                endArray = middleArray - 1;
            } else if (nums[middleArray] < target) {
                startArray = middleArray + 1;
            }
        }

        return startArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }
}
