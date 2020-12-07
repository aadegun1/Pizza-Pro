package com.company;

import java.util.Random;

public class Receipt {


    public static void printme(String pizzaPrice, String pizzatopping, String firstName, String lastName, String pickupPerson){

    System.out.println("******************************************************************\n");
    System.out.println( "Your order number is " + Receipt.receiptOrderNumber());


    System.out.println("Thank you " + firstName + " " + lastName + " for shopping at Pizzapizza! ");

    System.out.println( "Your order is  " + pizzatopping + " " + pizzaPrice + " pizza " + "\n " + pickupPerson +  "will pickup your order " );

    double totalCost= Menu.PizzaCost(pizzaPrice);

        //System.out.println("\nYour order total is " + Menu.PizzaCost(pizzaPrice));

    System.out.println("\nYour order total is " + Receipt.OrderTotal(totalCost));

    System.out.println("Have a nice day!");

    System.out.println("\n******************************************************************\n");

    }

    public static double receiptOrderNumber() {

        Random rand = new Random();
        double randdub1 = rand.nextDouble();
        return randdub1;

    }

    public static double OrderTotal(double pizzaPrice ){

       final double  TAX =.06;  //constant varible

       return (pizzaPrice *  TAX) + pizzaPrice ;

    }

}