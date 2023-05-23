package applications;

import interface1.ApplicationCalculator;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class Calculator implements ApplicationCalculator{

    Scanner scanner=new Scanner(System.in);

    @Override
    public void arithmeticOperation(String operation) {
        Scanner scanner = new Scanner(System.in);
        String number = "3";
        int applicationNumber = 0;

        while (true) {
            System.out.println(""" 
                                   
                                        CALCULATOR
                                                                                
                          +------------------------------------+
                            multiply     divide                        
                          |                                    |
                            add          subtract                    
                          +------------------------------------+
                           
                                      Кобойтуу учун 
                    "multiply" созун жазыныз!
                                      Болуу учун 
                    "divide" созун жазыныз!
                                      Кошуу учун
                    "add" созун жазыныз!  
                                      Кемитуу учун
                    "subtract" созун жазыныз!                     
                               """);
            break;
        }
        Scanner sr = new Scanner(System.in);
        while (true) {


            String word = sr.nextLine();
            if (word.equals("multiply")) {
                number = word;
            }

            if (!(Objects.equals(number, "multiply"))) {

                switch (word) {

                    case "multiply" -> {
                        System.out.println("Write number: ");
                        Scanner scanner1 = new Scanner(System.in);
                        BigDecimal num1 = new BigDecimal(scanner1.nextLine());
                        System.out.println("Write multiply number: ");
                        BigDecimal num2 = new BigDecimal(scanner1.nextLine());
                        BigDecimal resultMultiply = num1.multiply(num2);
                        System.out.println("Result: " + resultMultiply);
                    }
                    case "divide" -> {
                        System.out.println("Write number: ");
                        Scanner scanner2 = new Scanner(System.in);
                        BigDecimal num3 = new BigDecimal(scanner2.nextLine());
                        System.out.println("Write divide number: ");
                        BigDecimal num4 = new BigDecimal(scanner2.nextLine());
                        BigDecimal resultDivide = num3.divide(num4);
                        System.out.println("Result: " + resultDivide);
                    }
                    case "add" -> {
                        System.out.println("Write number: ");
                        Scanner scanner3 = new Scanner(System.in);
                        BigDecimal num5 = new BigDecimal(scanner3.nextLine());
                        System.out.println("Write add number: ");
                        BigDecimal num6 = new BigDecimal(scanner3.nextLine());
                        BigDecimal resultAdd = num5.add(num6);
                        System.out.println("Result: " + resultAdd);
                    }
                    case "subtract" -> {
                        System.out.println("Write number: ");
                        Scanner scanner4 = new Scanner(System.in);
                        BigDecimal num7 = new BigDecimal(scanner4.nextLine());
                        System.out.println("Write subtract number: ");
                        BigDecimal num8 = new BigDecimal(scanner4.nextLine());
                        BigDecimal resultSubtract = num7.subtract(num8);
                        System.out.println("Result: " + resultSubtract);
                    }
                }
            }
        }
    }
    @Override
    public String name() {
        return null;
    }
}
