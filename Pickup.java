package com.company;

import java.util.Scanner;

public class Pickup {

    //array
    public static String pickup() {
        Scanner sc = new Scanner(System.in);

        String[] pNames = new String[1];

        for (int i = 0; i < pNames.length; i++) {

            System.out.print("Enter who will pick up your order" + " :");

            pNames[i] = sc.nextLine();
        }

        System.out.println(pNames[0] + " will pick up your order");

        return pNames[0];
    }

//method overloading didn't know how to do this
      //pickup p = new pickup();
        //System.out.println(p.pickup(10, 20));
       // System.out.println(p.pickup(10, 20, 30));


    public int pickup(int x, int y)
    {
        return (x + y);
    }

    // Overloaded
    public int pickup(int x, int y, int z)
    {
        return (x + y + z);
    }

}
