class twoSum {
    public int[] twoSumSolution(int[] nums, int target) {
        for(int i=0 ; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){           
              if(nums[i]+nums[j]==target){
                int [] sum ={i,j};
                return sum;
                }
            }
        }
        return null;
    }
}
