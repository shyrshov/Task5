package com.company.threeTwo;
import com.company.threeOne.FirstClass;
import com.company.threeOne.SecondClass;


class ThirdClass {
    double e;
    String f;

    public ThirdClass () {
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        System.out.println(firstClass.a);
        System.out.println(secondClass.d);

        //Package private access - class in package threeTwo has no access to classes in package threeOne

    }
}
