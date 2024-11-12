import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

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

