package Project;

import java.util.Scanner;
public class ConnectFour {
    public static String[][] createBoard() {
        String[][] board = new String[7][15];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 15; j++) {
                if (j % 2 == 0) {
                    board[i][j] = "|";
                }
                else {
                    board[i][j] = " ";
                }
                if (i == 6) {
                    board[i][j] = ".";
                }
            }
        }
        return board;
    }

    public static void dropDisk(String[][] board, String color) {
        Scanner stdin = new Scanner(System.in);
        boolean full = true;
        System.out.print("Drop a " + color + " disk at column (0 - 6): ");
        int column = stdin.nextInt() * 2 + 1;

        if (column > 15) {
            System.out.print("That column is out of range.\n");
            column = 0;
            dropDisk(board, color);
        }
        else {
            for (int i = 5; i >= 0; i--) {
                if (board[i][column].equals(" ")) {
                    board[i][column] = Character.toString(color.charAt(0));
                    full = false;
                    break;
                }
            }
            if (full) {
                System.out.print("That column is full.\n");
                dropDisk(board, color);
            }
        }
    }

    public static String checkFour(String[][] board) {
        //Checks if four horizontal board pieces are connected.
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 7; j+= 2) {
                if ((board[i][j] != " ") && (board[i][j + 2] != " ") && (board[i][j + 4] != " ") && (board[i][j + 6] != " ")) {
                    if ((board[i][j].equals(board[i][j + 2])) && (board[i][j + 2].equals(board[i][j + 4])) && (board[i][j + 4].equals(board[i][j + 6]))) {
                        return board[i][j];
                    }
                }
            }
        }

        //Checks if four vertical board pieces are connected.
        for (int i = 1; i < 15; i+= 2) {
           for (int j = 0; j < 3; j++) {
               if ((board[j][i] != " ")  && (board[j + 1][i] != " ") && (board[j + 2][i] != " ") && (board[j + 3][i] != " ")) {
                   if ((board[j][i].equals(board[j + 1][i])) && (board[j][i].equals(board[j + 2][i])) && (board[j][i].equals(board[j + 3][i]))) {
                       return board[j][i];
                   }
               }
           }
        }

       //Checks if four diagonal board pieces are connected (upwards).
       for (int i = 0; i < 3; i++) {
           for (int j = 7; j < 15; j+= 2) {
               if ((board[i][j] != " ") && (board[i + 1][j - 2] != " ") && (board[i + 2][j - 4] != " ") && (board[i + 3][j - 6] != " ")) {
                   if ((board[i][j].equals(board[i + 1][j - 2])) && (board[i][j].equals(board[i + 2][j - 4])) && (board[i][j].equals(board[i + 3][j - 6]))) {
                       return board[i][j];
                   }
               }
           }
       }

       //Checks if four diagonal board pieces are connected (downwards).
       for (int i = 0; i < 3; i++) {
           for (int j = 1; j < 9; j += 2) {
               if ((board[i][j] != " ") && (board[i + 1][j + 2] != " ") && (board[i + 2][j + 4] != " ") && (board[i + 3][j + 6] != " ")) {
                   if ((board[i][j].equals(board[i + 1][j + 2])) && (board[i][j].equals(board[i + 2][j + 4])) && (board[i][j].equals(board[i + 3][j + 6]))) {
                       return board[i][j];
                   }
               }
           }
       }
       return "None";
    }

    public static boolean checkDraw(String[][] board) {
        boolean notEmpty = true;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 15; j += 2) {
                if (board[i][j].equals((" "))) {
                    notEmpty = false;
                }
            }
        }
        return notEmpty;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        String[][] gameBoard = createBoard();
        int turn = 1;
        boolean gameInProgress = true;
        printBoard(gameBoard);
        System.out.print("Turn 1 - ");
        while (gameInProgress) {
            if (turn % 2 == 0) {
                dropDisk(gameBoard, "Yellow");
            } else {
                dropDisk(gameBoard, "Red");
            }
            turn++;
            printBoard(gameBoard);
            switch (checkFour(gameBoard)) {
                case "R":
                    System.out.print("The Red player won!");
                    gameInProgress = false;
                    break;
                case "Y":
                    System.out.print("The Yellow player won!");
                    gameInProgress = false;
                    break;
                default:
                    if (checkDraw(gameBoard)) {
                        System.out.print("Draw!");
                        gameInProgress = false;
                        break;
                    } else {
                        System.out.print("Turn " + turn + " - ");
                        break;
                    }
            }
        }
    }
}
