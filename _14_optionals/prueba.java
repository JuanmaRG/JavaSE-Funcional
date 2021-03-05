package com.juanmarg.functional._14_optionals;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class prueba {
    public static void main(String[] args) {
        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){

        }

        optionalNames.ifPresent(names -> names.forEach(System.out::println));
        //Si sabemos que el optionalNames nos va  adevovler una lista podemos generar un iterador apartir de
        //los elementos de la lista.
        Optional<String> valuesPlayer = optionalValuablePlayer();

        String valuablePlayerName = valuesPlayer.orElseGet(() -> "No player");

    }


    static Optional<List<String>> getOptionalNames(){
            List<String> namesList = new LinkedList<>();
            //Obtencion de nombres
            return Optional.of(namesList);
        }

    static Optional<String> optionalValuablePlayer(){
        try{
            //accesos
            return Optional.of("ALL SUCCESS");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
