class Solution {
    public boolean divideArray(int[] nums) {

        Arrays.sort(nums);
        int count = 0;
        int divide = nums.length / 2;

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
                count++;
                i++;
            }
            if (count == divide){
                return true;
            }
        }
        return false;

        
    }
}