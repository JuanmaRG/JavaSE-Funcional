package com.juanmarg.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArgument cliaArguments){
        Consumer<CLIArgument> consumerHelper = cliArgument -> {
            if(cliaArguments.isHelp()){
                System.out.println("Manual solicitado");
            }
        };
        consumerHelper.accept(cliaArguments);
    }
    static CLIArgument generateCLI(){
        Supplier<CLIArgument> generator = () -> new CLIArgument();
        return generator.get();
    }
}
