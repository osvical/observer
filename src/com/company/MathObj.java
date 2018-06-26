package com.company;

public class MathObj implements Observer {
    private MathBehavior mathBehavior;

    public MathObj(MathBehavior mb) {
        setMathBehavior(mb);
    }

    public void setMathBehavior(MathBehavior mb) {
        mathBehavior = mb;
    }

    public void performMath(int x, int y) {
        System.out.println(mathBehavior.calculate(x, y));
    }

    @Override
    public void update(Subject o) {
        performMath(o.getX(), o.getY());
    }
}
