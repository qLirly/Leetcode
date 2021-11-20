class Solution {
    public int minMoves(int[] nums) {
        int floor = nums[0];
        
        long relativeSum = 0;
        
        for (int i : nums) {
            if (i < floor) {
                floor = i;
            }
            
            relativeSum += i;
        }
        
        return (int) (relativeSum - nums.length * floor);
    }
}
