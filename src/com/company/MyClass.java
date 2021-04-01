package com.company;

class MyClass {

    static int staticField;
    int dynamicField;

    static void change(int value) {
        staticField = staticField + value;
    }

    void anotherChange(int value) {
        dynamicField = dynamicField + value;
    }
}
