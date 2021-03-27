package com.company;

public class Six {
    int a;
    int b;

    private Six (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Six createObjectSix(int a, int b) {
        return new Six(a, b);
    }
}
