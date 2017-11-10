public class Main {

    public static void main(String[] args) {

//        drawLine(9, '_');
//        System.out.println("");
//        drawLine(9, '_');
//        System.out.println("");
//        drawLine(9, '_');

        drawRect(5, '-');
    }

    public static void drawLine (int a, char b){
        for (int p = 0; p < a; p++){
            System.out.print(b);
        }
    }

    public static void drawRect(int c, char d){
        for(int w = 0; w < c; w++){
            drawLine(c, '=');
            System.out.println();
        }
    }
}