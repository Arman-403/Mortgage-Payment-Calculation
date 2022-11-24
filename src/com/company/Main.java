package com.company;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {

public static void main(String[]args){

       
                byte monthsInYears = 12 ;
                byte percentage = 100;

                Scanner sc = new Scanner(System.in);


                double principleAmount;
                while (true) {
                        System.out.print("Principle Amount [1000 - 10,00000]:  ");
                        principleAmount = sc.nextDouble();
                        if ((principleAmount >= 1000) && (principleAmount <= 1000000)) {
                                break;
                        } else {
                                System.out.println("Enter the value between 1000 to 10,00000");
                        }
                }

                float annualInterest;
                while (true){

                        System.out.print("Annual Interest Rate: ");
                        annualInterest = sc.nextFloat();
                        if ((annualInterest > 0) && (annualInterest <= 30)){
                                break;
                        }else{
                                System.out.println("Enter the value greater than 0 and less than 30");
                        }
                }
                float monthlyInterest = annualInterest / percentage /monthsInYears;

                int years;
                while(true){
                        System.out.print("Enter the number of months (In Years): ");
                        years = sc.nextInt();
                        if ((years > 0) && (years <= 30)){
                                break;
                        }else {
                                System.out.println("Enter the value between 1 and 30");
                        }
                }

                int noOfPayments = years * monthsInYears ;

                double mortgage = principleAmount * monthlyInterest * ((Math.pow(1+monthlyInterest, noOfPayments))/((Math.pow(1+monthlyInterest, noOfPayments)) -1)) ;

                String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println(formattedMortgage);

        }
}



