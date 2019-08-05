import java.util.*;

public class TwoSum {

	// array value is key and index is value
	private static HashMap<Integer, Integer> map = new HashMap<>();

	private static void setup(int[] nums) {
		for (int i = 0; i < nums.length; ++i) {
			map.put(nums[i], i);
		}
	}

	public static int[] indicies(int[] nums, int target) {
		setup(nums);
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; ++i) {
			if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
				arr[0] = i;
				arr[1] = map.get(target - nums[i]);
				return arr;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(indicies(test, 3)));
	}
}