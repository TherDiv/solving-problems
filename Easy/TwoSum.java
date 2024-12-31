import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices encontrados " + result[0] + " y " + result[1]);
    }

}