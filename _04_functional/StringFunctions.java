package com.juanmarg.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quaote  = text -> "\"" + text +"\"";

        System.out.println(quaote.apply("Hola Estudiantes de platzi"));

        BiFunction<String,Integer,String> leftpad =
                (text, number) -> String.format("%"+ number + "s", text);

        BinaryOperator<Integer> multiplicacion = (x, y) -> x * y;


        System.out.println(leftpad.apply("Java",10));
    }
}
