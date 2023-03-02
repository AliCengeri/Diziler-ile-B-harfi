public class Main {
    public static void main(String[] args) {
        String[][] letterb = new String[7][4];

        for (int i = 0; i < letterb.length; i++) {
            for (int j = 0; j < letterb[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letterb[i][j] = " * ";
                }else if (j == 0 || j == 3){
                    letterb[i][j] = " * ";
                }
                else {
                    letterb [i][j] = "   ";
                }
            }
        }
        for (String[] row : letterb){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}