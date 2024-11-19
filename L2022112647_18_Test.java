import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    
    // 可能的等价类划分准则？
    //    正常情况
    //        所有元素非零：测试数组中所有元素都不为零的情况。
    //        包含一个零：测试数组中包含一个零的情况，因为任何数与零相乘都是零。
    //        包含多个零：测试数组中包含多个零的情况，此时除了零位置的答案为非零元素的乘积外，其他位置的答案都应该是零。
    //    边界情况
    //        数组为空：此时返回空数组
    //        数组长度为1：测试数组只有一个元素的情况。
    //        数组长度为2：测试数组只有两个元素的情况。
    //        更长的数组：常规业务情况
    //    特殊情况
    //        所有元素相同：测试数组中所有元素都相同的情况。
    //        包含负数：测试数组中包含负数的情况，以检查乘积的正负性是否正确处理。
    //    按照三个维度划分：
    //     数组长度：空/1/2/更长
    //     数组中的零：全部非零/一个零/多个零
    //     包含负数：有/无
    //     特殊的：所有元素相同

    @Test
    public void testProductExceptSelf1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }

    @Test
    public void testProductExceptSelf2() {
        Solution solution = new Solution();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }
}

