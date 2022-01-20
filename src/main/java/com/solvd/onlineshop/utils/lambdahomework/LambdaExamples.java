package com.solvd.onlineshop.utils.lambdahomework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LambdaExamples {

    private static final Logger LOGGER = LogManager.getLogger(LambdaExamples.class);


    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Charlie");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };

        gm2.greet("Charlie");

        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };

        mp.printMessage();
    }
}
