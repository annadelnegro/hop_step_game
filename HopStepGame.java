/* Anna Del Negro
 * Dr. Andrew Steinberg
 * COP3503 Spring 2024
 * Programming Assignment 4
 */

public class HopStepGame {
    /* recursive approach: method #1 */
    public int minCost(int[] costArray, int totalSquares) {
        /* taking care of base case */
        if (totalSquares < 0) {
            return 0;
        }
        /* taking care of reaching target totalSquares (last or second to last) */
        if (totalSquares == 0 || totalSquares == 1) {
            return costArray[totalSquares];
        }

        /* recursive calls for minCost (top-bottom approach) */
        int step = costArray[totalSquares] + minCost(costArray, totalSquares - 1);
        int hop = costArray[totalSquares] + minCost(costArray, totalSquares - 2);
        return Math.min(step, hop); /* returns smallest value (minCost) */
    }

    /* memoization approach: method #2 */
    /* 3rd parameter sent from driver file */
    public int minCostMemoization(int[] costArray, int startIndex, int[] memoArrDriver) {
        int len = costArray.length;
        Integer memoArray[] = new Integer[len]; /* initialize to null */
        /* utilize helper for memoization */
        return minCostHelperMethod(costArray, startIndex, memoArray);
    }

    private int minCostHelperMethod(int[] costArray, int startIndex, Integer[] memoArr) {
        /* base case: no cost before the array starts returns 0 */
        if (startIndex < 0) {
            return 0;
        }
        /* check: result for startIndex computed? */
        if (memoArr[startIndex] != null) {
            return memoArr[startIndex];
        }
        memoArr[startIndex] = costArray[startIndex] + Math.min(minCostHelperMethod(costArray,
                startIndex - 1, memoArr), minCostHelperMethod(costArray, startIndex - 2, memoArr));
        /* returns the calculated min cost for the current startIndex */
        return memoArr[startIndex];
    }

    /* tabulation approach: method #3 */
    public int minCostTabulation(int[] costArray) {
        int len = costArray.length;
        /* dynamic array to store min cost to reach each step */
        int[] dpArray = new int[len];

        /* base case: 1) if only one step > return that step */
        if (len == 1) {
            return costArray[0];
        }

        /* base cases: 2) cost for reach first and second steps */
        dpArray[0] = costArray[0];

        /* consider cost of 2nd step to see if can jump directly */
        dpArray[1] = Math.min(costArray[1], dpArray[0] + costArray[1]);

        /* calc min cost starting on pos #3 */
        for (int i = 2; i < len; i++) {
            dpArray[i] = costArray[i] + Math.min(dpArray[i - 1], dpArray[i - 2]);
        }

        /* total min cost is that of the last two steps */
        return Math.min(dpArray[len - 1], dpArray[len - 2]);
    }

}