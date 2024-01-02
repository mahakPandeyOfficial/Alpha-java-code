public class Day18 {
    public static boolean isSafe(int sudoku[][], int row , int col , int digit){
        //colomn
        for(int i = 0; i<=8 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //row
        for(int j=0 ; j<=8 ; j++){
            if(sudoku[row][col] == digit){
                return false;
            }
        }

        //grid
        int sr = (row+3) * 3;
        int sc = ()
    }
}