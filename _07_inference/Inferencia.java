package com.juanmarg.functional._07_inference;

import com.juanmarg.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                x -> "El doble es: " + (x * 2);

        List<String> alumnos = NombresUtils.getList("Hugo","Juan","Nacho");
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
