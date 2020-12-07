package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        String firstName;
        String lastName;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Pizza Pizza below is the MENU"+"\n--------------------------------------------"+" \nPizza Size"+"\nlarge = 15.99| medium = 13.99|small = 12.99"+"\n\nType of Pizza"+"\nChesse|Chicken|Pepperoni|Veggie");
        System.out.println("\n-------------------------------");
        System.out.println("Please Enter First Name:");
        firstName =sc.nextLine();
        System.out.println("Please Enter Last Name:");
        lastName =sc.nextLine();



        String allpizza = "We are out of garlic dipping sauce!";

        Yo result = new Yo( allpizza);
        System.out.println(result.getallpizza());
        System.out.println("\n-------------------------------");


        Receipt.receiptOrderNumber();
        Receipt.printme( Menu.menu(), Toppings.topping(), firstName, lastName, Pickup.pickup() ) ;

    }


}