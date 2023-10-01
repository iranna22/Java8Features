package com.iranna.optionaldemo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name= "iranna";
        String email="iranna@123.gmail.com";
        String place=null;

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);


        Optional<String> nameOptional = Optional.of(name);
        System.out.println(nameOptional);

        Optional<String> placeOptional2 = Optional.ofNullable(place);
        System.out.println("null value with ofNullable:"+" "+ placeOptional2);

        Optional<String> emailOptional = Optional.ofNullable(email);
        System.out.println("email value with ofNullable:"+" "+ emailOptional);
        System.out.println("extracting  value from optional object using get method:"+" "+ emailOptional.get());

        if(emailOptional.isPresent()){
            System.out.println(emailOptional.get());
        }


        Optional<String> placeOptional = Optional.ofNullable(place);
        if(placeOptional.isPresent()){
            System.out.println(placeOptional.get());
        }else {
            System.out.println("No value found");
            //System.out.println(placeOptional);
        }
    }
}
