/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author Huzi.Wang[imhuzi.wh@gmail.com]
 * @version 1.0
 * @program leetcode
 * @description
 * @create 2019-03-22 14:14
 **/
public class TowSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int nums1[] = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] result = twoSum(nums1, target1);
        System.out.printf("index:%d,%d", result[0], result[1]);
    }
}
