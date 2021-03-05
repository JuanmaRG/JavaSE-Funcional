package com.juanmarg.functional._09_defaults;

public class StringFunctions {
    @FunctionalInterface
    interface StringOperation{
        int getAmount();
        default void operate(String text){
            int x = getAmount();
            while(x-- > 0){
                System.out.println(text);
            }
        }
    }
    @FunctionalInterface
    interface DoOperation{
        void take(String text);
        default void execute(int x, String s){
            while(x-- > 0){
                take(s);
            }
        }
    }

    public static void main(String[] args) {
        StringOperation  six = () -> 3;
       six.operate(("Juan"));

        DoOperation op = text -> System.out.println("Juan");
       op.execute(5,"Platzi");


    }
}
