package com.company;

public class Mul implements MathBehavior {
    @Override
    public int calculate(int x, int y) {
        return x*y;
    }
}
