package Odd_in_front_of_Even;

class Solution {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            while(i < j && nums[i] % 2 == 1) {
                i++;
            }
            while(i < j && nums[j] % 2 == 0) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
}
