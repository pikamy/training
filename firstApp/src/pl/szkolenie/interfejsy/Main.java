package pl.szkolenie.interfejsy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Exercise1(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Exercise2(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Jeżeli chcesz dodawać kliknij 1, jeżeli mnożyć 2");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        if (choose == 1) {
            return true;
        }else {
            return false;
        }
    }

    private double getArgument() {
        System.out.println("Podaj liczbę");
        Scanner input = new Scanner(System.in);
        int arg = input.nextInt();

        return arg;
    }
}

