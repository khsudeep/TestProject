package com.company.DpForCI.Chapter1;

public class TowerOfHanoi {
    private int bestSolutionLevel = 1;
    public void getBestSolution(String S, String E, String D, int n)
    {
        switch (this.bestSolutionLevel) {
            case 1:
                this.printRecursiveSolution(S, E, D, n);
            default:
                break;
        }

    }

    public void printRecursiveSolution(String S, String E, String D, int n)
    {
        if(n<=0) {
            return;
        }
        //System.out.println("N is: "+n+", S has: "+S + ", D has: "+D);
        this.printRecursiveSolution(S, D, E, n-1);
        System.out.println("Move "+n + " from "+ S + " to " + D);
        this.printRecursiveSolution(E, S, D, n-1);
    }
}
