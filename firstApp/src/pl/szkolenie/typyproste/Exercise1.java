package pl.szkolenie.typyproste;

import java.util.Scanner;

public class Exercise1 {

    public static float summarizedOfSubject(float[] nameOfSubject){
        float summarized = 0;
        float sum = 0;
        for (int i = 0; i < nameOfSubject.length; i++){
            sum += nameOfSubject[i];
        }
        summarized = sum / nameOfSubject.length;
        return summarized;
    }


    public static void main(String[] args) {
        float[] matematyka = new float[] {1F,2F,3.5F,4F};
        float[] fizyka = new float[] {1F,2F,3.5F,4F};
        float[] polski = new float[] {1F,2F,3.5F,5F};
        float[] wf = new float[] {1.5F,1.5F,3.5F,3.5F};
        Scanner input = new Scanner(System.in);
        System.out.println("Dla jakiego przedmiotu wyliczyć średnią?");
        System.out.println("1 - matematyka, 2 - fizyka, 3 - polski, 4 - wf");

        int subject = input.nextInt();

        switch (subject){
            case 1:
                System.out.println("Summarized of subject is: " + summarizedOfSubject(matematyka));
                break;
            case 2:
                System.out.println("Summarized of subject is: " + summarizedOfSubject(fizyka));
                break;
            case 3:
                System.out.println("Summarized of subject is: " + summarizedOfSubject(polski));
                break;
            case 4:
                System.out.println("Summarized of subject is: " + summarizedOfSubject(wf));
                break;
            default:
                System.out.println("brak takiego przedmiotu");
                break;
        }


    }
}
