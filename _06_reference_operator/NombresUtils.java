package com.juanmarg.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("Juan","Nicolas","Sergey");
        //Consumer<String> printer = text -> System.out.println(text);

        //profesores.forEach(printer);
        /*Otra forma de imprimir sin necesidad de crear un cosumidor*/
        //profesores.forEach(System.out::println);

        profesores.forEach(e -> System.out.println(e));




    }
    public static <T>List<T> getList(T ... elements){
        return Arrays.asList(elements);
    }
}
