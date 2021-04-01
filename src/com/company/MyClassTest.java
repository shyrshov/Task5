package com.company;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(MyClass.staticField);
        System.out.println(myClass.dynamicField);
        myClass.change(10);
        myClass.anotherChange(20);
        System.out.println(MyClass.staticField);
        System.out.println(myClass.dynamicField);

    }
}

