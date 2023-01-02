// https://leetcode.com/problems/rotate-function/

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum=0;
        
        //F(0)
        for(int i=0; i<n; i++){
            sum += nums[i];
            max += (i*nums[i]);
        }
        
        int prev = max;
        
        //F(1->(n-1))
        for(int i=1; i<n; i++){
            int curr = prev + sum - (n*nums[n-i]);
            prev = curr;
            max = Math.max(curr,max);
        }
        
        return max;
    }
}