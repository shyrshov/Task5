package com.company;

class StaticInt {
    static int a = 5;
    int b;

    public StaticInt (int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        StaticInt staticInt = new StaticInt(10, 20);
        System.out.println(staticInt.a);
        System.out.println(staticInt.b);

        StaticInt staticInt2 = new StaticInt(30, 50);
        System.out.println(staticInt2.a);
        System.out.println(staticInt2.b);
        System.out.println(staticInt.a);

        //static variable means that it is common to all objects of the same class. This field is loaded then the class loaded
        //non-static variables are separate copies for each object and load then the object is loaded
    }
}
