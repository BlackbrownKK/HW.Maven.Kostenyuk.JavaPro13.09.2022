import org.junit.Assert;
import org.junit.Test;
public class TwoSumAppTest {
    TwoSumApp twoSumApp = new TwoSumApp();
@Test
    public void twoSumTest() {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int target = 4;
        int[] result = {0,4};
        Assert.assertArrayEquals(result, twoSumApp.twoSum(nums, target));

    }
}
