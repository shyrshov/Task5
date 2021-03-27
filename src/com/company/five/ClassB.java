package com.company.five;


class ClassB {
    int one;
    char two;

    ClassB() {
        ClassA classA = new ClassA();
        System.out.println(classA.fullAccess);
        System.out.println(classA.packageAccess);
        System.out.println(classA.noAccessOne);
        System.out.println(classA.noAccessTwo);

        //private members in class can't be reached from other class, just inside the class they created.
        //but if the class have also public/package access members - they can be reached.
    }
}
