package com.juanmarg.functional._15_streams_intro;

import com.juanmarg.functional.util.Utils;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        Stream<String> courses = Stream.of("Algebra","Calculo","Discretas","Fisica");

        //calcular las letras de cada asignaturas
        Stream<Integer> longitudAsignatursa = courses.map(course -> course.length());
        //Conocer cual es el nombre mas largo que tenemos en el stream, hay que tener en cuenta si el stream está vacio.
        Optional<Integer> longest = longitudAsignatursa.max((x, y) -> y - x);

        //Añadimos el signo de explamacion a las asignaturas y las almacenamos en otro Stream
        Stream<String> emphasisCourses = longitudAsignatursa.map(course -> course + "!");
        //String resultante de este donde filtramos por palabra
        Stream<String> buscarAsignaturas = emphasisCourses.filter(course -> course.contains("is"));
        buscarAsignaturas.forEach(System.out::println);

        Stream<String>  curso = Utils.getListOf("Java","Node.js","Kotlin").stream();
        Stream<String> javaCoursesStream = curso.filter(c -> c.contains("Java"));

    }

}
