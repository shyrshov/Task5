package com.company.fourTwo;

import com.company.fourOne.FourthClass;

public class FifthClass {
    public int i;
    public int j;

    public void fifthClass() {
        FourthClass fourthClass = new FourthClass();
        System.out.println(fourthClass.g);
        System.out.println(fourthClass.h);
        System.out.println(fourthClass.g1);
        System.out.println(fourthClass.h1);

        //public access is access level when class can be reached from any other class,
        //also  fields, methods, blocks declared inside a public class can be accessed from any class
        //but private or package private fields, methods can't be reached even if they are in private class
    }
}
