package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData);// default is not visible outside the package
        //System.out.println(AccessModifiers.privateData);// private is not visible outside the class

        AccessModifiers.method1();
       // AccessModifiers.method2();//System.out.println(AccessModifiers.defaultData);// default is not visible outside the package
        //.method3();// private is not visible outside the class
    }
}
