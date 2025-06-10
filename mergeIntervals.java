/*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
Eg:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/

import java.util.*;

public class Main {
    public static int[][] merge(int[][] intervals) {
        //Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int n = intervals.length;
        int[][] merged = new int[n][2];
        int index = -1;

        for (int[] interval : intervals) {
            if (index == -1 || merged[index][1] < interval[0]) {
                index++;
                merged[index] = interval;  // Directly assign interval
            } else {
                // Merge with the previous interval
                merged[index][1] = Math.max(merged[index][1], interval[1]);
            }
        }

        // Copy only the filled part of merged
        return Arrays.copyOfRange(merged, 0, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
