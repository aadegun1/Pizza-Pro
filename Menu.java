package com.company;

import java.util.Scanner;

public class Menu {

   public static double pizzaPrice = 1;
    public static String menu() {


        Scanner sc = new Scanner(System.in);

        int pizza;
        String pizzaSize = "yummy pizza";


        System.out.println("What size pizza would you like? \n1:large = 15.99" +
                "  2: medium = 13.99 3:small = 12.99");
        pizza = sc.nextInt();


        if (pizza == 1) {

            pizzaSize = "Large (16 inches)";
            pizzaPrice =  15.99; //gather pizza int and convert to double

            Menu.PizzaCost(pizzaSize);

        } else if (pizza == 2) {
            pizzaSize = "Medium (14 inches)";
            pizzaPrice =  13.99;

            Menu.PizzaCost(pizzaSize);

        } else if (pizza == 3) {
            pizzaSize = "Small (12 inches)";

            pizzaPrice =  12.99 ;

            Menu.PizzaCost(pizzaSize);

        } else if (pizza != 1 && pizza != 2 && pizza != 3) {
            System.out.println("Invalid Option default option is small ");
            pizzaSize = "Small (12 inches)";
            pizzaPrice =  12.99;


        }
        return pizzaSize;

    }

    public static double PizzaCost(String pizzaSize) {

        return pizzaPrice;
    }
}
