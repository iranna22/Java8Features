package com.iranna.methodreferences;

//method reference for built in static method
interface JavaInterface{
    int findMax(int a, int b);
}
public class MethodRefDemo {
    public static void main(String[] args) {
        // Referring Method
        JavaInterface ji = Math::max;
        int result = ji.findMax(10, 20);
        System.out.println(result);

    }

}
