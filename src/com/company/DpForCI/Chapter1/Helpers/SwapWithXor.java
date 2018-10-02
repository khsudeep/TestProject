package com.company.DpForCI.Chapter1.Helpers;

public class SwapWithXor{

    public void swap(byte a, byte b)
    {
        b^=a;
        a^=b;
        b^=a;
    }
}
