package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userCommand;
        Integer result;

        System.out.println("Witaj w generatozre rzutow kostka.");
        System.out.println("Wpisz chciana operacja na podstawie wzoru \"xDy(+/-)y\". Gdzie: ");
        System.out.println("x - liczba rzutow kostka.");
        System.out.println("y - ilo scienna jest kostka.");
        System.out.println("+/- - mozliwosc dodania lub odjecia liczby od wyniku rzurow kostka.");
        System.out.println("y - liczba ktora ma zostac dodana lub odjeta do wyniku rzutow kostka.");

        userCommand = scanner.nextLine();
        String[] parts = userCommand.split("[d\\D\\+\\-]");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

        result = Integer.parseInt(parts[0]) * (random.nextInt(Integer.parseInt(parts[1]) - 1) + 1);

        if (userCommand.contains("+")) {
            result = result + Integer.parseInt(parts[2]);
        } else if (userCommand.contains("-")) {
            result = result - Integer.parseInt(parts[2]);
        }

        System.out.println("Otrzymany wynik to: " + result);
    }
}
