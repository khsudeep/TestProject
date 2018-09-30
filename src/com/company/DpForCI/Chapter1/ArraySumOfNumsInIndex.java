package com.company.DpForCI.Chapter1;

public class ArraySumOfNumsInIndex {

    private int bestSolutionLevel = 1;
    public int[] getBestSolution(int[] arr)
    {
        switch (this.bestSolutionLevel) {
            case 1:
                return this.simpleSolution(arr);
             default:
                 break;
        }

        return arr;
    }

    public int[] simpleSolution(int[] arr)
    {
        for (int i=0; i<arr.length; i++) {
            if(i==0) {
                continue;
            }
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
}
