package com.juanmarg.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MatchFunctions {
    public static void main(String[] args) {
        System.out.println("Hola platzi!");


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        isEven.test(4);

        Predicate<Student> isApproved = student -> student.getCalificacion() > 5;

        Student sinube =  new Student(5);
        System.out.println(isApproved.test(sinube));

    }
    static class  Student{


        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }
        public double getCalificacion() {
            return calificacion ;
        }
    }
}
