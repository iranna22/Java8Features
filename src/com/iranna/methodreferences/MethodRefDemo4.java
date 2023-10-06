package com.iranna.methodreferences;
//method reference for calling constructor
interface  ConstructorInterface{
    void callConstructor();
}
public class MethodRefDemo4 {
    public MethodRefDemo4() {
        System.out.println("calling constroctor using method reference");
    }

    public static void main(String[] args) {
        ConstructorInterface ci = MethodRefDemo4::new;
        ci.callConstructor();
    }
}
