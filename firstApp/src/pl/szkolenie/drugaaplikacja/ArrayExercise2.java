package pl.szkolenie.drugaaplikacja;

public class ArrayExercise2 {
    public int getHigherNum(int[] numbers) {
        int higherNum = numbers[0];
        if (numbers.length > 1) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > higherNum) {
                    higherNum = numbers[i];
                }
            }
        }
        return higherNum;
    }

    public static void main(String[] args) {
        ArrayExercise2 exercise = new ArrayExercise2();
        int[] array1 = {-1,-3,-4,-2,-1};
        System.out.println(exercise.getHigherNum(array1));
    }

}
