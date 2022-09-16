package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }


    static void run() {
        switch (Integer.parseInt(sc.nextLine())) {
            case 0 -> scitat(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            case 1 -> odcitat(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            case 2 -> nasobeni(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            case 3 -> deleni(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            default -> intro();
        }

    }

    static void scitat(double a, double b) {
        System.out.println(a + b);
    }

    static void odcitat(double a, double b) {
        System.out.println(a - b);
    }

    static void nasobeni(double a, double b) {
        System.out.println(a * b);
    }

    static void deleni(double a, double b) {
        System.out.println(a / b);
    }

    static void intro() {
        System.out.println("0 - scitat, 1 - odcitat, 2 - nasobeni, 3 - deleni");
    }
}