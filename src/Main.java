import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Озунуздун телефонунзду тузунуз. Телефонунузда томондогу
        мумкунчулуктор болсун: заметки, банк приложения, калькулятор
        Заметкиге озунуз каалаганча текст турундо маалыматтарды
        сактай алыныз жана аларды озгортуп очуруп
        колдонунуз.
                Bank приложенияда озунуздун балансынызды текшеруу, башка
        адамдын картасына акча которуу жана телефон номерге бирдик салуу мумкунчулуктору болсун
        Калькулятордо болсо сандарды кошуп, алып, кобойтуп, боло алыныз.*/

        Scanner String = new Scanner(System.in);
        String[] application = new String[]{"""

                              HELLO!
                """,
                """
                         <NOTES>
                                     
                                number 1
                """,
                """
                        VR BANKING APP
                        
                                 number   2

                """,
                """
                        CALCULATOR
                        
                                  number   3

                """
        };
        String mobile = "off";
        int applicationNumber = 0;

        while (true) {
            System.out.println("""
                                PHONE APPLICATION
                                            
                    +------------------------------------+
                            |  off                on |
                            
                             |        PASSWORD
                    |
                            |     1 2 3              |
                    +------------------------------------+
                            
                                       Телефонду куйгузуу учун 
                     "on" созун жазыныз!
                                       Телефонду очуруу учун 
                     "off" созун жазыныз!
                                       Менюга кируу учун
                     "Menu" созун жазыныз!                  
                                       Каалаган приложенияга отуу 
                     учун приложениянын номерин жазыныз!
                                       Кийинки приложенияга отуу 
                     учун "next" созун жазыныз!
                                      Арткы приложенияга отуу 
                     учун "back" созун жазыныз!
                                                                       
                                """);
            String command = String.nextLine();
            if (!(mobile.equals("on"))) {
                mobile = command;
            }
            if (Objects.equals(mobile, "on")) {
                switch (command) {
                    case "on" -> {
                        System.out.printf("""
                                  +-----------------------------------+
                                              
                                              
                                                    %s
                                              
                                  +-----------------------------------+                      
                                """, application[applicationNumber]);
                    }
                    case "menu" -> {
                        System.out.println("~~~~~~~~~~~All applications," +
                                "number of application 3 ~~~~~~~~~");

                        System.out.println("------------------------");
                        for (int i = 1; i < application.length; i++) {
                            System.out.println(application[i]);

                            System.out.println("------------------------");
                        }

                    }
                    case "next" -> {
                        if (applicationNumber == 3) {
                            applicationNumber = 1;
                        } else {
                            applicationNumber++;
                        }
                        System.out.printf("""
                                +-----------------------------------+             
                                                                                                            
                                                    %s                  
                                                                                                                                
                                +-----------------------------------+  
                                                                
                                """, application[applicationNumber]);
                    }
                    case "back" -> {
                        if (applicationNumber == 1) {
                            applicationNumber = 3;
                        } else {
                            applicationNumber--;
                        }
                        System.out.printf("""
                                +-----------------------------------+
                                                      
                                                    %s
                                              
                                +-----------------------------------+  
                                                                
                                """, application[applicationNumber]);
                    }
//                    case "1" -> {
//                        applicationNumber = 1;
//                        String notes = "NOTES" + '\n' +
//                                "      Бугунку жасалуучу иштер!:\n" +
//                                "                \n" +
//                                "                * MyPhone дз бутуруу\n" +
//                                "                * Методы BigDecimal\n" +
//                                "                * Китеп окуу\n" +
//                                "                * Bewerbung жазуу\n" +
//                                "                * Техникалык сабакты коруу\n" +
//                                "                * Дз аткаруу\n" +
//                                "                * Уйго чалуу\n";
//                        System.out.printf("""
//                                +-----------------------------------+
//
//
//                                                    %s
//
//                                +-----------------------------------+
//
//                                """, notes);
//                    }

                    case "2" -> {
                        applicationNumber = 2;
                        String vrBankingApp = """
                                             
                                              VR BANKING APP
                                                                                           
                                      +------------------------------------+
                                        баланс текшеруу      бирдик толтуруу                         
                                      |                                      |
                                                  акча которуу                   
                                      +------------------------------------+
                                       
                                                  Баланс текшеруу учун 
                                "balance" созун жазыныз!
                                                  Телефон номерге бирдик салуу
                                 учун "replenish" созун жазыныз!
                                                  Акча которуу  учун
                                "transfer" созун жазыныз!     
                                           """;
                        System.out.printf("""
                                +-----------------------------------+
                                              
                                              
                                                    %s
                                              
                                  +-----------------------------------+  
                                                                
                                """, vrBankingApp);
                    }

                    case "balance" -> {
                        applicationNumber = 1;
                        String balance = "СИЗДИН БАЛАНСЫНЫЗ:" + '\n';
                        //итоговый баланс
                        double totalBalance = 1450.34;
                        System.out.printf("""
                                 +-----------------------------------+
                                            %s %s
                                 +-----------------------------------+
                                """, balance, totalBalance);
                    }
                    //пополнить
                    case "replenish" -> {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Write phone number: ");
                        String phoneNumber1 = scanner.nextLine();
                        while (phoneNumber1.isEmpty()) {
                            System.out.println("Бул жер бош калбашы керек!");
                            phoneNumber1=scanner.nextLine();
                        }
                        // желаемая сумма
                        System.out.println("Desired amount: ");
                        BigDecimal desiredAmount = scanner.nextBigDecimal();
                        double totalBalance = 1450.34;
//                         if (desiredAmount>totalBalance){
//                             System.out.println("Акчаныз жетишсиз!");
//                         }else {
                        System.out.println("Толом ийгиликтуу аткарылды!");

                        BigDecimal totalBalans = new BigDecimal(1450.34);
                        BigDecimal subtract = totalBalans.subtract(desiredAmount);

                        System.out.println("СИЗДИН БАЛАНСЫНЫЗДА :" + '\n' + subtract + " КАЛДЫ ");

                        //                       }

                    }
                    case "transfer" -> {
                        double totalBalance = 1450.34;
                        System.out.println("Write Recipient name: ");
                        Scanner scanner = new Scanner(System.in);
                        String name = scanner.nextLine();
                        while (name.isEmpty()) {
                            System.out.println("Бул жер бош калбашы керек!");
                            name = scanner.nextLine();
                        }
                        System.out.println("IBAN: ");
                        String iban = scanner.nextLine();
                        while (iban.isEmpty()) {
                            System.out.println("Бул жер бош калбашы керек!");
                            iban = scanner.nextLine();
                        }
                        if (!(iban.startsWith("DE") && iban.length() >= 20)) {
                            System.out.println("Картанын номери DE менен башталышы керек жана 20 сандан туруусу шарт!");
                        }else {
                            System.out.println("Amount: ");
                            double amount = scanner.nextDouble();

                            if (amount > totalBalance) {
                                System.out.println("Акчаныз жетишсиз!");
                            } else {
                                System.out.println("Notes: ");
                                String notes = scanner.nextLine();
                                System.out.println(LocalDate.now());
                                String date = scanner.nextLine();
                                while (date.isEmpty()) {
                                    System.out.println("Бул жер бош калбашы керек!");
                                    date = scanner.nextLine();
                                }
                                System.out.println("Write code: ");
                                String code = scanner.nextLine();
                                while (code.isEmpty()) {
                                    System.out.println("Бул жер бош калбашы керек!");
                                    code = scanner.nextLine();
                                }
                            }


                                System.out.println("Толом ийгиликтуу аткарылды!");
                            }
                        }


                    case "3" -> {
                        applicationNumber = 3;
                        String calculator = """ 
                                               
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
                                           """;

                        System.out.printf("""
                                +-----------------------------------+
                                   
                                   
                                            %s
                                   
                                              
                                +-----------------------------------+  
                                                                
                                """, calculator);
                    }
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
                    case "off" -> {
                        System.out.printf("""
                                +-----------------------------------+
                                              
                                              
                                         PHONE OFF           
                                              
                                  +-----------------------------------+  
                                                                
                                """);
                        mobile = "off";
                    }
                    default -> {
                        System.out.println("Туура эмес кнопканы басып жатасын!");
                    }

                }
            } else {
                System.out.println("Телефонду куйгузмойунчо башка функциялар иштебейт!");
            }
        }

    }


}
