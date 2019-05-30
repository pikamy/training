package pl.szkolenie.pierwszaaplikacja;

public class Main {
    public static void main(String[] args) {

        String message1 = "Zdanie 1";
        System.out.println(message1);

        String message2 = "Zdanie 2";
        System.out.println(message2);

        String message3 = "Zdanie 3";
        System.out.println(message3);

        String fullMessage = message1 + message2 + message3;
        int length = fullMessage.length();

        System.out.println("Łaczna liczba znaków wszystkich zdań wynosi : " + length);
    }
}
