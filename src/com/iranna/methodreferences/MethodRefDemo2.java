package com.iranna.methodreferences;

//method reference for instance method
interface MyInterface {
    void showInterfaceInfo();
}

public class MethodRefDemo2 {
    void show() {
        System.out.println("This is called using instance method reference");
    }
    public static void main(String[] args) {
        MethodRefDemo2 demo = new MethodRefDemo2();
        MyInterface ji = demo::show;
        ji.showInterfaceInfo();
    }
}
