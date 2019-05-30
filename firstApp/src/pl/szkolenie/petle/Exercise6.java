package pl.szkolenie.petle;

public class Exercise6 {

    public static int sumTable(int[][] table){
        int sum = 0;
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                sum = sum + table[i][j];
            }
        }
        return sum;
    }





    public static void main(String[] args) {
        int[][] table1 = new int[][]{
                new int[] {1,2,3},
                new int[] {1,2,3},
                new int[] {1,2,3},
                new int[] {1,2,3},
                new int[] {1,2,3,1},
        };

        System.out.println(sumTable(table1));
    }
}
