class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList < Integer > arr = new ArrayList < Integer > (nums.length);

        for (int i = 0; i < nums.length; i++) {
            int l = 0;
            for (int j = 0; j <= i; j++) {
                l += nums[j];
            }
            System.out.println(l);
            arr.add(l);
        }

        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        return nums;
    }
}
