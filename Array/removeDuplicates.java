class Solution {
    public int removeDuplicates(int[] nums) {
   
       if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
//initiating with second value considering the first value to be unique and comparing it with previous value to check they are unique or not
//if not unique then we are overwriting with the help of k
