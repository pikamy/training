package pl.szkolenie.drugaaplikacja;

public class BoardLesson {


    public int sum(int[] numbers) {
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers = sumNumbers + numbers[i];
        }
        return sumNumbers;
    }

    public static void main(String[] args) {
        BoardLesson board = new BoardLesson();
        int[] numbers = {1};
        System.out.println(board.sum(numbers));
    }



}



