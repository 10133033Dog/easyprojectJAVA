package org;

public class Class2 implements Interface2 {
    @Override
    public void method2() {
        System.out.println("Class2: method2");
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.method2();
    }
}
