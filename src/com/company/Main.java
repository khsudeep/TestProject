package com.company;

import com.company.DpForCI.Chapter1.ArraySumOfNumsInIndex;
import com.company.DpForCI.Chapter1.TowerOfHanoi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 3, 4, 5, 6};
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.getBestSolution("S", "E", "D", 3);
    }
}
