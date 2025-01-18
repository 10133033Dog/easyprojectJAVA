package org.example;
public class Main {
    public static void main(String[] args) {
        // Работа с інтерфейсом
        If3 if3 = new If3Impl();
        if3.method1();
        if3.method2();
        if3.method3();

        //робота з класами
        Cl3 cl3 = new Cl3();
        cl3.methodCl3();
        cl3.methodCl2();  // від Cl2
    }
}
