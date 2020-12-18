public class Main {

    public static final char HUMAN = 'X';
    public static final char PC = 'O';

    public static int[][] GameField;
    public static int MaxWeight;
    public static int MaxHeight;

    public static void DrawField(){
        MaxHeight = 3;
        MaxWeight = 3;
        GameField = new int[MaxWeight][MaxHeight];
        for (int i = 0; i < MaxWeight; i++){
            for (int j = 0; j < MaxHeight; j++) {
                System.out.print("|");
            }

        }
        System.out.println();
    }




    public static void Main(String[] args){
        DrawField();
    }


}
