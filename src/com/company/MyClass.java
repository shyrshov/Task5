package com.company;

class MyClass {

    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = staticField + 10;
    }

    void anotherChange(int value) {
        dynamicField = dynamicField + 20;
    }
}
