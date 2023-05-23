package applications;

import interface1.Bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class ApplicationBank implements Bank {
    Scanner scanner = new Scanner(System.in);




    @Override
    public void selectAktion(String aktion) {
        Scanner scanner = new Scanner(System.in);
        String number = "2";
        int applicationNumber = 0;

        while (true) {
            System.out.println("""
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
                                   "transfer" созун жазыныз!     """);


            String word = scanner.nextLine();


            switch (word) {

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
                    break;
                }

                //пополнить
                case "replenish" -> {
                    System.out.println("Write phone number: ");
                    String phoneNumber = scanner.nextLine();
                    while (phoneNumber.isEmpty()) {
                        System.out.println("Бул жер бош калбашы керек!");
                        phoneNumber = scanner.nextLine();
                    }
                    // желаемая сумма
                    System.out.println("Desired amount: ");
                    BigDecimal desiredAmount = scanner.nextBigDecimal();
                    double totalBalance = 1450.34;
//                         if (desiredAmount>totalBalance){
//                             System.out.println("Акчаныз жетишсиз!");
//                         }else {
                    System.out.println("Толом ийгиликтуу аткарылды!");

                    BigDecimal totalBalans = new BigDecimal("1450.34");
                    BigDecimal subtract = totalBalans.subtract(desiredAmount);

                    System.out.println("СИЗДИН БАЛАНСЫНЫЗДА :" + '\n' + subtract + " КАЛДЫ ");
                }
                case "transfer" -> {
                    double totalBalance = 1450.34;
                    System.out.println("Write Recipient name: ");
                    Scanner scanner2 = new Scanner(System.in);
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
                    } else {
                        System.out.println("Amount: ");
                        double amount = scanner.nextDouble();

                        if (amount > totalBalance) {
                            System.out.println("Акчаныз жетишсиз!");
                        } else {
                            System.out.println("Notes: ");
                            String notes = scanner.nextLine();
                            System.out.println(LocalDate.now());
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


            }
        }
    }

    @Override
    public String name() {
        return null;
    }
}



