package com.company;

import java.util.Scanner;
        //loop

public class Toppings{
public static String topping() {

        System.out.println("What size type of pizza would you like? \n1:chesse pizza" +
                "  2: chicken pizza 3:pepporoni pizza 4:veggie pizza ");

        Scanner sc = new Scanner(System.in);

        int extra;
        String topping = "cool";

        extra = sc.nextInt();


            if (extra == 1) {
                topping = "chesse";

            } else if (extra == 2) {
                topping = "chicken";

            } else if (extra == 3) {
                topping = "pepperoni";


            } else if (extra == 4) {
                topping = "veggetables";

            } else if (extra != 1 && extra != 2 && extra != 3) {
                System.out.println("Invalid Option default option is ");
                topping = "chesse";


            }
        return topping;
        }

    }


