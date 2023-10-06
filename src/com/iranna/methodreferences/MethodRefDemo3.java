package com.iranna.methodreferences;

interface JavaInterface2{
    int stringLength();
}

public class MethodRefDemo3 {
    public static void main(String[] args) {
        MethodRefDemo3 demo = new MethodRefDemo3();
        // Referring Method
        JavaInterface2 ji = "hello"::length;
        int result = ji.stringLength();
        System.out.println(result);
    }
}
