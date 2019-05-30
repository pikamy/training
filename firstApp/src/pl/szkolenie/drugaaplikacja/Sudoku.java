package pl.szkolenie.drugaaplikacja;

public class Sudoku {
    private int[][] sudokuTable = new int[9][9];

    public void setSudokuTable(int oX,int oY, int number){
        sudokuTable[oX][oY] = number;
    }

    public int getSudokuTable(int oX,int oY){

        return sudokuTable[oX][oY];
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.setSudokuTable(1,1,4);
        sudoku.setSudokuTable(1,2,3);

        System.out.println(sudoku.getSudokuTable(1,1));

    }
}
