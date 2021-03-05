package com.juanmarg.functional._11_composition;



import jdk.nashorn.internal.ir.FunctionCall;

import java.util.function.Function;

public class MathOperation2 {
    public static void main(String[] args) {

        //Function<Integer, Integer> MultiplicarPor3 = x -> x *3;
        Function<Integer,Integer> MultiplicarPor3 = x -> {
            System.out.println("Multiplica (3 * X) , siendo x: " + x );
            return x *3;
        };

        Function<Integer, Integer> Suma1aMultiplicarPor3 =
                MultiplicarPor3.compose(y -> {
                    System.out.println("Suma 1+Y, siendo Y: :" + y);
                    return y+1;
                });

        Function<Integer,Integer> andSquere =
                Suma1aMultiplicarPor3.andThen(x ->{
                    System.out.println("Elevando al cuadrado " + x);
                    return x * x;
                });

        System.out.println(andSquere.apply(3));
    }
}
