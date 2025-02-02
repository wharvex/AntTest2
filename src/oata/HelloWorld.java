package oata;

import org.apache.log4j.Logger;

public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        logger.info("Log Hello World");
        System.out.println("Hello World");
    }

    public static int evaluate(String expression) {
       int sum = 0;
       for (String summand: expression.split("\\+"))
         sum += Integer.valueOf(summand);
       return sum;
    }
}
