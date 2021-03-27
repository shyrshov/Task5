package com.company.threeOne;

import com.company.threeTwo.ThirdClass;

class SecondClass {
    int c;
    char d;

    public SecondClass() {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.a);
        System.out.println(firstClass.b);

        //package private access - class in threeOne package has access to classes and fields in the same package,

        ThirdClass thirdclass = new ThirdClass();
        System.out.println(thirdclass.e);

        //but doesn't has access to classes and other fields in other packages

    }

}
