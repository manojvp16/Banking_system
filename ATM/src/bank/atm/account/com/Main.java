package bank.atm.account.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 double balamce = 0.0;
        int atmNUm=123456;
        int atmPin=12234;

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CODER'S BANK!!");

        System.out.print("enter your account number:");
         int newNum = sc.nextInt();
        System.out.print("enter your pin:");
        int newPin = sc.nextInt();

        if(atmNUm==newNum && atmPin==newPin){
            System.out.println("Account verifed");

            while (true){
                System.out.println("1: Deposite Ammont:");
                System.out.println("2: Withdrawl Ammount:");
                System.out.println("3: Available Balance:");
                System.out.println("4: Exit");

                System.out.print("select your choice:");
                int  ch =sc.nextInt();

                switch (ch){

                    case  1:
                        System.out.print("enter the ammount you want to deposite:");
                        int deposite = sc.nextInt();
                        balamce = balamce+deposite;
                        System.out.println("your current balance ia:"+balamce);
                        break;

                    case  2:
                        System.out.print("enter the ammount you want to withdrawl:");
                        int withdrawl = sc.nextInt();
                      if(balamce<= withdrawl){
                          System.out.println("you don't have an sufficient balance:");
                      }
                      else {
                          balamce=balamce-withdrawl;
                          System.out.println("your current balance is:"+balamce);

                      }
                      break;
                    case  3:
                        System.out.println("your account balance is:"+balamce);
                        break;

                    case  4:
                        System.exit(0);


                }
                System.out.println("please revisit the ATM"+ "hava a nice day!");

            }



        }
        else {
            System.out.println("Incorrect number or pin");
            System.exit(0);
        }


    }
}
