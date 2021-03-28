package com.company;

import java.sql.SQLOutput;

public class GetterSetter {
    private int a;
    private int b;
    private double c;
    private String d;
    private int e;

    public void setA(int newA) {
        if (newA >= 1 && newA <= 100) {
            this.a = newA;
            System.out.println("New value is = " + newA + " cm");
        } else {
            throw new IllegalArgumentException("Value " + newA + "cm is incorrent. Please use Setter to millimeter or meter fields");
        }
    }

    public int getA(){
        return a;
    }

    public void setB(int newB) {
        if (newB == 10) {
            this.b = newB;
            System.out.println("You just won the lottery");
        } else {
            throw new IllegalArgumentException("Your bet " + newB + " is lost. You won nothing");
        }
    }

    public int getB() {
        return b;
    }

    public void setC(double newC) {
        if (newC > 0 || newC < 0) {
            this.c = newC;
            System.out.println("You choose valid value " + newC);
        } else {
            throw new IllegalArgumentException("You choose " + newC + ". Please, choose another value");
        }
    }

    public double getC() {
        return c;
    }

    public void setD (String newD) {
        if (newD.length() >= 3) {
            this.d = newD;
            System.out.println("Your comment: '" + newD + "' added successfully. Thank you.");
        } else {
            throw new IllegalArgumentException("Your comment is too short. Please add more information");
        }
    }

    public String getD() {
        return d;
    }

    public void setE (int newE) {
        if (newE >=1 && newE <=10) {
            this.e = newE;
            System.out.println("Your score" + newE + " added to your results");
        } else {
            throw new IllegalArgumentException("You entered invalid value " + newE + ". Please enter value between 1 and 10");
        }
    }

    public int getE() {
        return e;
    }
}
