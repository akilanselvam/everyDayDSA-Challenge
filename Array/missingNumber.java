class Solution {
  public int missingNumber(int[] nums) {
    int num = 0;
    HashSet < Integer > strNum = new HashSet();
    for (int n: nums) {
      strNum.add(n);
      System.out.println(n);
    }
    for (int i = 0; i < nums.length; i++) {

      if (!strNum.contains(i)) {
        return i;
      }
    }
    return nums.length;

  }
}
