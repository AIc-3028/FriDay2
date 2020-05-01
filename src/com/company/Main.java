package com.company;

import javax.print.DocFlavor;

public class Main {

    public static void myFirstMethod() {
        // write your code here
        System.out.println("Hello World");

    }


    public static int mathMethod(int x, int y ){

        return x + y;

    }

    public  static String stringConverter(Integer x){

        return x.toString();

    }

    public static void myName(String first, String last){

        System.out.printf("Hello. My name is %s %s!%n",first, last);

    }

    public static double weightConverter(double pounds){

        //Convert from pound to kilos
        double kilos = pounds*0.45;
        return kilos;

    }

    public static StringBuilder stringReverser(String string){
        StringBuilder rev = new StringBuilder();

        for (int i = string.length()-1; i >= 0; i--){
            System.out.println(string.charAt(i));
            rev.append(string.charAt(i));
        }
        return rev;

    }

    public static void divider(int x, int y){

        if (x == 0 || y == 0){

            System.out.println("That's not allowed");

        }

        int result = x/y;
        int mod = x % y;
        System.out.println(result + " " + mod);

    }

    public static String madLib(String name, String noun, String adj, String verb, String otherVerb, String otherNoun, String otherName, String yetAnotherNoun){

        return "Hello, my name is " + name +
                " I'm a " + noun +
                " and I like to " + verb +
                " " + adj + "! I'm not a " + otherName +
                " I still use Amazon a lot though. It's the only place where I can find" + yetAnotherNoun ;

    }

    public static void main(String[] args) {

        myFirstMethod();
        myFirstMethod();

        System.out.println(mathMethod(3,4));
        System.out.println(stringConverter(4));

        myName("Daniel", "Morales Garcia");

        System.out.println(weightConverter(4.00d));

        System.out.println(stringReverser("Help"));
        divider(7,3);

        System.out.println(madLib("Sett","CLOWN","loose ", "Kills", "cripple", "Team", "coward", "Garen"));
    }

}
