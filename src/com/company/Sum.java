package com.company;

public class Sum implements MathBehavior {
    @Override
    public int calculate(int x, int y) {
        return x+y;
    }
}
