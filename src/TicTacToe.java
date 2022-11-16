
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

    public class TicTacToe {
        public static String checkForWinner(String[][] gameBoard) {
            if((Objects.equals(gameBoard[0][0], gameBoard[1][1])) && Objects.equals(gameBoard[1][1], gameBoard[2][2])){
                if(gameBoard[1][1].equals("X")) return "The winner is X";
                else if(gameBoard[1][1].equals("O")) return "The winner is O";
            }else if((Objects.equals(gameBoard[0][2], gameBoard[1][1])) && Objects.equals(gameBoard[1][1], gameBoard[2][0])) {
                if (gameBoard[1][1].equals("X")) return "The winner is X";
                else if(gameBoard[1][1].equals("O")) return "The winner is O";
            }else {
                for (int i = 0; i < 3; i++) {
                    if ((Objects.equals(gameBoard[0][i], gameBoard[1][i])) && Objects.equals(gameBoard[1][i], gameBoard[2][i])) {
                        if (gameBoard[0][i].equals("X")) return "The winner is X";
                        else if(gameBoard[0][i].equals("O")) return "The winner is O";
                    }else if ((Objects.equals(gameBoard[i][0], gameBoard[i][1])) && Objects.equals(gameBoard[i][1], gameBoard[i][2])) {
                        if (gameBoard[i][0].equals("X")) return "The winner is X";
                        else if(gameBoard[i][0].equals("O")) return "The winner is O";
                    }
                }
            }
            for (String[] strings : gameBoard) {
                for (String string : strings) {
                    if (string.equals(" ")) {
                        return "Next turn";
                    }
                }
            }
            return "Its a tie";
        }


        public static String[][] nextTurn(String[][] gameBoard, boolean turnX){
            Scanner scanner = new Scanner(System.in);
            boolean isValidSpace = true;
            if(turnX) System.out.println("X's turn");
            else System.out.println("O's turn");
            System.out.println("Here is the game board:\n" +
                    Arrays.toString(gameBoard[0]) + "\n" +
                    Arrays.toString(gameBoard[1]) + "\n" +
                    Arrays.toString(gameBoard[2]));

            do{
                System.out.println("which row would you like to play (1, 2, or 3)");
                int row = scanner.nextInt();

                System.out.println("which space do you want to play (1, 2, or 3)");
                int space = scanner.nextInt();

                if(gameBoard[row - 1][space - 1].equals(" ")){
                    isValidSpace = true;
                    if(turnX) gameBoard[row - 1][space - 1] = "X";
                    else gameBoard[row - 1][space - 1] = "O";
                }else {
                    System.out.println("This is not a valid space");
                    isValidSpace = false;
                }

            }while(!isValidSpace);
            return gameBoard;
        }

        public static void main(String[] args) {
            String[][] gameBoard = {
                    {" ", " ", " "},
                    {" ", " ", " "},
                    {" ", " ", " "}
            };
            boolean turnX = true;
            String winner;

            do {
                gameBoard = nextTurn(gameBoard, turnX);
                winner = checkForWinner(gameBoard);
                turnX = !turnX;
            }while (winner.equals("Next turn"));

            System.out.println(winner);
            System.out.println("Final game board:\n" +
                    Arrays.toString(gameBoard[0]) + "\n" +
                    Arrays.toString(gameBoard[1]) + "\n" +
                    Arrays.toString(gameBoard[2]));

        }
    }
