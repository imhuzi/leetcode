package net.imhuzi.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * 这个问题首先我第一想法想到的就是转成 char数组，然后反转，判断上下边界
 *
 * @author Huzi.Wang[imhuzi.wh@gmail.com]
 * @version 1.0
 * @program leetcode
 * @description
 * @create 2019-03-26 09:42
 **/
public class ReverseIntegerSolution {
    /**
     * 遇到反转，首先能想到的就是，char array 然后从后往前输出
     *
     * @param num
     * @return
     */
    public static int reverseInteger(int num) {
        String str = num + "";

        char[] charArr = str.toCharArray();
        str = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            str += charArr[i];
        }
        str = str.replace("-", "");
        long t = Long.parseLong(str);
        if (num < 0) {
            return  -t < Integer.MIN_VALUE ? 0 : -Integer.parseInt(str);
        }
        return t > Integer.MAX_VALUE ? 0 : Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(-1534232339));
        ;
    }
}
