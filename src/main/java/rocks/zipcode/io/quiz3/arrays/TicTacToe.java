package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String board[][];
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        return Arrays.stream(board)
                .map(row -> row[value])
                .toArray(String[]::new);
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        return Arrays.stream(board[rowIndex])
                .allMatch(str -> str.equals(board[rowIndex][0]));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return Arrays.stream(column)
                .allMatch(str -> str.equals(column[0]));
    }

    public String getWinner() {
        String winner = null;

        if(board[0][0].equals(board[1][1]) &&
                board[0][0].equals(board[2][2])){
            winner = board[0][0];
        }
        else if(board[0][2].equals(board[1][1]) &&
                board[0][2].equals(board[0][2])){
            winner = board[0][2];
        }
        else{
            for (int i = 0; i < board.length; i++) {
                Boolean rowEqual = isRowHomogenous(i);
                Boolean columnEqual = isColumnHomogeneous(i);
                if(rowEqual || columnEqual){
                    winner = board[i][0];
                    break;
                }
            }
        }

        return winner;
    }

    public String[][] getBoard() {
        return null;
    }
}
