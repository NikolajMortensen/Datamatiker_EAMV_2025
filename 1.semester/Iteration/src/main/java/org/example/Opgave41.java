public class Opgave41 {
    public static void main(String[] args) {
        // Instantiere et 2-dimensionelt array
        int[][] boardIntern = {{1,2,1},
                               {2,1,0},
                               {0,0,2}};
        // Row er lodret og column er vandret
        for (int row = 0; row<3; row++){
            for (int column = 0; column<3; column++){ // Kører alle tal igennem på hvert row, vha. column for-løkken
                if(boardIntern[row][column] == 1){ // Hvis der en 1'er = print X
                    System.out.print("X");
                }else if (boardIntern[row][column] == 2){ // Hvis der en 2'er = print 0
                    System.out.print("O");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
