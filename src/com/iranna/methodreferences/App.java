package com.iranna.methodreferences;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        int result=MethodReferenceDemo.add(10,2);
        System.out.println("calling the traditional way "+result);

        //lambda expression
        BinaryOperator<Integer> adder1 = (a,b)->MethodReferenceDemo.add(a,b);
        int result1= adder1.apply(10,2);
        System.out.println("calling with lambda expression "+ result1);

        //method references
        BinaryOperator<Integer> adder2 = MethodReferenceDemo::add;
        int result2 = adder2.apply(10,2);

        System.out.println("calling with method reference " + result2);

        BinaryOperator<Integer> sub1 = MethodReferenceDemo::subtract;
        int result3 = sub1.apply(10,2);
        System.out.println("calling subtract using method reference "+result3);






    }
}
