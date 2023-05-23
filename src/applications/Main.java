package applications;

import interface1.ApplicationCalculator;
import interface1.Phone;

import java.util.Objects;
import java.util.Scanner;

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

        System.out.println("""
                                PHONE AKTIONS
                                            
                    +------------------------------------+
                            |  off                on |
                            
                                       MENU
                    
                            |     1         2         3  |
                    +------------------------------------+
                            
                                       Телефонду куйгузуу учун 
                     "on" созун жазыныз!
                                       Телефонду очуруу учун 
                     "off" созун жазыныз!
                                       Менюга кируу учун
                     "Menu" созун жазыныз!                  
                                       Каалаган приложенияга отуу 
                     учун приложениянын номерин жазыныз!
                                                                       
                                """);
        while (true) {

            String command = String.nextLine();
            if (!(mobile.equals("on"))) {
                mobile = command;
            }
            if (Objects.equals(mobile, "on")) {
                switch (command) {
                    case "on" -> {
                        System.out.printf("""
                                  
                                                  HELLO!
                                  +-----------------------------------+
                                         |  off                on |
                                        
                                                    MENU
                                        
                                        |   1         2         3  |  
                                              
                                                      
                                  +-----------------------------------+  
                             
                                                 Телефонду очуруу учун 
                             "off" созун жазыныз!
                                                 Менюга кируу учун
                             "Menu" созун жазыныз!                  
                                                    
                                """);
                    }
                    case "menu" -> {

                        System.out.println("~~~~~~~~~~~All applications," +
                                           "number of application 3 ~~~~~~~~~");

                        System.out.println("------------------------");
                        for (int i = 1; i < application.length; i++) {
                            System.out.println(application[i]);

                            System.out.println("------------------------");
                        }
         while ((true)){
             System.out.println("Приложение номерин танданыз! ");
             Scanner scanner=new Scanner(System.in);
             String word=scanner.nextLine();
             switch (word){
                 case "1" -> {
                     applicationNumber = 1;
                     Scanner scanner1 = new Scanner(System.in);
                     System.out.println("Write notes name: ");
                     String notesName = scanner.nextLine();
                     System.out.println(notesName);
                     System.out.println("Write notes: ");
                     String notes = scanner.nextLine();
                     System.out.println(notes);
                 }
                 case "2" -> {
                     ApplicationBank applicationBank=new ApplicationBank();

                     applicationBank.selectAktion("""

                                              VR BANKING APP

                                      +------------------------------------+
                                        баланс текшеруу      бирдик толтурууppp
                                      |                                      |
                                                  акча которуу
                                      +------------------------------------+

                                                  Баланс текшеруу учун
                                "balance" созун жазыныз!
                                                  Телефон номерге бирдик салуу
                                 учун "replenish" созун жазыныз!
                                                  Акча которуу  учун
                                "transfer" созун жазыныз!
                                           """);
                     System.out.printf("""
                                +-----------------------------------+
                                              
                                              
                                                    %s
                                              
                                  +-----------------------------------+  
                                                                
                                """, applicationBank);
                 }
                 case "3"->{
                     ApplicationCalculator applicationCalculator=new Calculator();
                     applicationCalculator.arithmeticOperation(
                             """ 
                                                    
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

                     System.out.printf("""
                                +-----------------------------------+
                                   
                                   
                                            %s
                                   
                                              
                                +-----------------------------------+  
                                                                
                                """, applicationCalculator);
                 }

             }
         }
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




