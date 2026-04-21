class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        int []arr = new int[2];
        int l = 0, r = n-1;
        while(l < r)
        {
            int sum = num[l] + num[r];
            if(sum == target)
            {
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            }
            else if(sum < target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return arr;

        
    }
}
