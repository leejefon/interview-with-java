package com.leejefon.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> exec(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int lowerIndex = i + 1;
                int higherIndex = nums.length - 1;

                while (lowerIndex < higherIndex) {
                    int currSum = nums[i] + nums[lowerIndex] + nums[higherIndex];
                    if (currSum > 0) {
                        higherIndex--;
                    } else if (currSum < 0) {
                        lowerIndex++;
                    } else {
                        results.add(new ArrayList<>(Arrays.asList(nums[i], nums[lowerIndex], nums[higherIndex])));
                        while (lowerIndex < higherIndex && nums[lowerIndex] == nums[lowerIndex + 1]) lowerIndex++;
                        while (lowerIndex < higherIndex && nums[higherIndex] == nums[higherIndex - 1]) higherIndex--;
                        lowerIndex++;
                        higherIndex--;
                    }
                }
            }
        }

        return results;
    }
}
