class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> uniqueNums = new HashSet<>();
        for (int i=0;i<nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    uniqueNums.add(nums1[i]);
                }
            }
        }

        int[] intArray = new int[uniqueNums.size()]; 
        int i=0;
        for(int n:uniqueNums){
            intArray[i]=n;
            i++;
        }
        return intArray;        
    }
}
