public class ExHouseRobber {

    public static int rob(int[] nums) {
        int [] newNums = new int[nums.length];

        newNums[0] = nums[0];
        newNums[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < newNums.length; i++){
            newNums[i] = Math.max(newNums[i - 1], newNums[i-2] + nums[i]);
        }
        return newNums[newNums.length - 1];
    }
    public static void main(String[] args) {
    int [] nums = {4,7,9,3,1};
        System.out.println(rob(nums));
    }
}
