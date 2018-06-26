package com.company;

public class Main {

    public static void main(String[] args) {
        MathObj mo = new MathObj(new Sum());
        MathObj mo2 = new MathObj(new Sum());
        mo2.setMathBehavior(new Mul());
        Subject s = new Subject();
        s.setX(3);
        s.setY(4);
        s.addObserver(mo);
        s.addObserver(mo2);
        s.notifyObservers();
        s.deleteObserver(mo2);
        s.setY(3);
        s.notifyObservers();
    }
}
