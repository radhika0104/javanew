class Solution {
    public int[] nextPermutation(int[] nums) {
        int n= nums.length;
        //first decr element from right
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            int l=0;
            int r=n-1;
            while(l<r){
                swap(nums,l,r);
                l++;
                r--;
                }
               return nums;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        // reverse everything after pivot
        int l=pivot+1;
        int r= n-1;
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
        return nums;
    }
    static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    } 
}
