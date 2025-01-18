package org;

public class Main {
    public static void main(String[] args) {
        // Работа с интерфейсами
        If1 if1 = new If1Impl();
        if1.method1();
        if1.method2();
        if1.method3();

        // Работа с классами
        Cl1 cl1 = new Cl1();
        cl1.methodCl1();
        cl1.methodCl3();  // Наследованный метод от Cl3
    }
}