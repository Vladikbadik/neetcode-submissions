class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                 int result = nums[i] + nums[j];
                 if (result == target){
                    return new int[]{i, j};
                 }

            }
        }
        return new int[]{};
    }
}