package pl.szkolenie.petle;

public class Exercise5 {

    public static int sumTable(int[] table){
        int sum = 0;
        for (int i = 0; i < table.length; i++){
            sum = sum + table[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] table1 = new int[] {1,2,2,3,4,5,6};
        System.out.println(sumTable(table1));

    }
}
