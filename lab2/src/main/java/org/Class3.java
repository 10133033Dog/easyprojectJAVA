package org;

public class Class3 implements Interface2, Interface3 {
    @Override
    public void method2() {
        System.out.println("Class3: method2");
    }

    @Override
    public void method3() {
        System.out.println("Class3: method3");
    }

    public static void main(String[] args) {
        Class3 class3 = new Class3();
        class3.method2();
        class3.method3();
    }
}
