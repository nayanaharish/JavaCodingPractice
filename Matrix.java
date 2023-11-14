package sdcC601Assign1;

public class Matrix {
    public static void main(String[] args) {

        int [] [] sudoku = {
                {8,2,1,5,6,7,3,9,4},
                {6,3,4,8,2,9,1,7,5},
                {7,5,9,3,4,1,8,6,2},
                {3,4,6,2,8,5,9,1,7},
                {2,9,7,6,1,4,5,3,8},
                {5,1,8,9,7,3,4,2,6},
                {1,7,5,4,3,6,2,8,9},
                {4,8,3,7,9,2,6,5,1},
                {9,6,2,1,5,8,7,4,3}
        };


        int count = 0;
        for (int row  = 0; row < sudoku.length; row = row +3)
        {
            for (int col = 0 ; col < sudoku.length ; col=col +3)
            {

                for (int i = row; i < row + 3; i++ ) {
                    for (int j = col; j < col + 3; j++) {
                        count ++;
                        System.out.print(sudoku[i][j] +"  ");
//                        if (count%3 == 0)
//                            System.out.println();
                    }
                }
                System.out.println();
            }
        }
    }
}
