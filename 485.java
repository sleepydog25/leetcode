//485
//https://leetcode.com/problems/max-consecutive-ones/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        //write the int array to an String ArrayList

        List <String> newarr = new ArrayList <>();
        for (int e:nums){
            newarr.add(Integer.toString(e));
        }

        /*
        testing 

        for (String f:newarr){
            System.out.print(f);
        }
        */

        //concat the item in newarr
        String buffer =newarr.stream().collect(Collectors.joining(""));

        int count = 0;
        int maxCount =  0;
 
        // Loop through the binary string to find the longest consecutive 1s
        for (int i = 0; i < buffer.length(); i++) {
            if (buffer.charAt(i) == '1') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
 
        // Print the result
        return maxCount;


    }
}
