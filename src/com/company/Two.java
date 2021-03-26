package com.company;
import com.company.domainname.*;
import com.company.modulename.*;


public class Two {
    public static void main(String[] args) {
        Same same2 = new Same(8, "room");
    }
}

//C:\GitHub\Task5\src\com\company\Two.java:8:9
//java: reference to Same is ambiguous
//  both class com.company.modulename.Same in com.company.modulename and class com.company.domainname.Same in com.company.domainname match

//we have to create objects using unambitious classes. And in this case use just one import or create an object specifying the full name of the classe
