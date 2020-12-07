package com.company;

public class Everything {


    //inheretence
    void sauce() {
        System.out.println("all pizza have tomato sauce");
    }

    void dough(){ System.out.println("all pizza dough are made with flour");

    }
    void chesse(){ System.out.println("all pizza's have cheese on top");

    }
class Extra extends Everything{

        void notenough(){ System.out.println( "Some pizza's come with a surprise drinkhave hesese");

        }

    }

}