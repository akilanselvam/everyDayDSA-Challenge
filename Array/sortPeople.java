class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,List<String>> sortPplMap = new HashMap<>();
        for(int i=0;i<names.length;i++){
            sortPplMap.computeIfAbsent(heights[i], k -> new ArrayList<>()).add(names[i]);

        }
        System.out.println(sortPplMap);
         Arrays.sort(heights);

        

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int temp = heights[left];
            heights[left] = heights[right];
            heights[right] = temp;

            left++;
            right--;
        }

 
       for (int i = 0; i < heights.length; i++) {
            List<String> nameList = sortPplMap.get(heights[i]);
            names[i] = String.join(",", nameList);
        }

        return names;
    }
}
