package Number_of_1_Bits;

public class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        while(n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;
    }
}
