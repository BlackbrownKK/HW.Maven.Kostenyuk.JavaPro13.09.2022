import java.util.HashMap;
import java.util.Map;
public class TwoSumApp {
    public  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerNums = new HashMap<>();
        int[] result = new int[2];
        for (int argument1 = 0; argument1 < nums.length; argument1++) {
            int argument2 = target - nums[argument1];
            if (integerNums.containsKey(argument2)) {
                result[0] = integerNums.get(argument2);
                result[1] = argument1;
            } else integerNums.put(nums[argument1], argument1);
        }
        return result;
    }
}

