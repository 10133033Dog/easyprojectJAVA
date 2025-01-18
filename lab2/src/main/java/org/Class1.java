package org;

public class Class1 implements Interface1 {
    @Override
    public void method1() {
        System.out.println("Class1: method1");
    }

    public void method2() {
        System.out.println("Class1: method2");
    }

    public void method3() {
        System.out.println("Class1: method3");
    }

    public static void main(String [] args) {
        Class1 class1 = new Class1();
        class1.method1();
        class1.method2();
        class1.method3();
    }
}
