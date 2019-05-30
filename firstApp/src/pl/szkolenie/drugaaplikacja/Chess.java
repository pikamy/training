package pl.szkolenie.drugaaplikacja;

import java.util.Arrays;

public class Chess {

    private Integer[][] chessBoard;

    public Chess(Integer[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public static Chess someChessBoard(){
        Integer[][] chessBoard = new Integer[][]{
                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},

                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},

                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},
                new Integer[] {1,2,1,3},

        };
        return new Chess(chessBoard);

    }

    public static void main(String[] args) {
        Chess someChessBoard = someChessBoard();
        System.out.println(Arrays.deepToString(someChessBoard.chessBoard));
    }

}
