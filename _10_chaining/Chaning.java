package com.juanmarg.functional._10_chaining;

public class Chaning {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder();

        sb.append("Hola")
                .append("Alumno")
                .append("De")
                .append("Marte");

        chainer c = new chainer();
        c.sayHi()
                .sayBye();
    }

    static  class chainer {
        public chainer sayHi() {
            System.out.println("Hola terricola");
            return this;
        }
        public chainer sayBye(){
            System.out.println("Hasta otra invasion!");
            return this;
        }
    }

}
