package leetcode;

import java.util.Arrays;

public class minStone {
    public static int lastStoneWeight(int[] stones) {

        int length = stones.length;
        while(length > 1) {
            Arrays.sort(stones);
            int max = stones[length - 1];
            int secondMax = stones[length - 2];
            stones[length - 2] = 0;
            if (secondMax == max) {
                stones[length - 1] = 0;
            } else {
                stones[length - 1] = max - secondMax;
            }
            length --;
        }

        return stones[0];
    }

    public static void main(String[] args){
        int[] stones = {2, 7, 2, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
}
