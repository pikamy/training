package pl.szkolenie.wyjątki;

import java.util.Scanner;

public class Exercise1 {


    private double sqrt(int number){
        double result;
        if (number>=0){
            result = java.lang.Math.sqrt(number);
            return result;
        }else {
            throw new java.lang.IllegalArgumentException();
        }
    }



    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);
            System.out.println("Wprowadź liczbę");
            int arg = input.nextInt();

        catch (java.util.InputMismatchException exception){
            System.out.println("Podana wartość nie jest liczbą");
        }





        try {

            Exercise1 exercise1 = new Exercise1();
            System.out.println(exercise1.sqrt(arg));

        }
        catch (IllegalArgumentException exception){

            System.out.println("Podana liczba nie jest liczbą");

        }

    }


}
