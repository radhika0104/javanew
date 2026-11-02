class Solution {
    public int minMoves(int[] nums) {
        int min= nums[0];
        int n= nums.length;
        int moves=0;
        for(int val:nums){
            min= Math.min(min,val);
        }
        for(int val:nums){
            moves+=(val-min);
        }
        return moves;
        
    }
}
