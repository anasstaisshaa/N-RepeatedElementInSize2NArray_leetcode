class Solution {
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;

        for(int i = 0; i < nums.length; i++){
            int count = 1;

            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j])
                    count++;
            }
            if(count == n)
                return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        repeatedNTimes(nums);
    }
}