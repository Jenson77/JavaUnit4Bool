package Iteration;

public class Printer1 {

    public static void printTriangle (int n){
        for (int i = 4; 0 < i; i--) {
            for (int j = i; 0 < j; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void getRanNumsInRounds(int r) {
        for (int i = 0; i < r; i++) {
            String s = "Round "+(i+1)+"...";
            for (int j = 0; j < r; j++) {
                s+= (int) (Math.random() *10 +1)+" ";
            }
            System.out.println(s);
        }
    }

    public static void getRanNumsInRounds2(int r) {
        int total = 0;
        for (int i = 0; i < r; i++) {
            String s = "Round "+(i+1)+"...";
            int k = 0;
            for (int j = 0; j < r; j++) {
                int h = (int)(Math.random() *10 +1);
                k += h;
                s+= h+" ";
            }
            s+= k;
            System.out.println(s);
            total += k;
        }
        System.out.println("Total: "+total);
    }



    public static void main(String[] args) {
        printTriangle(10);
        getRanNumsInRounds2(5);
    }


}
