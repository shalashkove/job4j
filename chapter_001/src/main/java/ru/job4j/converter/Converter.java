package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
//        int euro = rubleToEuro(140);
//        System.out.println("140 rubles are " + euro + " euro.");
//        int dollar = rubleToDollar(300);
//        System.out.println("300 rubles are " + dollar + " dollar.");
//        int rubleFromEuro = euroToRuble(3);
//        System.out.println("3 euro are " + rubleFromEuro + " ruble.");
//        int rubleFromDollar = dollarToRuble(4);
//        System.out.println("4 dollar are " + rubleFromDollar + " ruble.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 300;
        expected = 5;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5. Test result : " + passed);

        in = 3;
        expected = 210;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("3 euro are 210. Test result : " + passed);

        in = 4;
        expected = 240;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("4 dollar are 240. Test result : " + passed);
    }
}