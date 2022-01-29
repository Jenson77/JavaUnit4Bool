package ComparingObjects;
import java.util.Scanner;

public class EvenOdd {

    private int minimum;
    private int maximum;



    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public boolean isEven(int n) {
        return n%2 == 0;
    }


    public String evenBetween() {
        String r = "";
        int i = minimum;
        while (i<=maximum) {
            if (isEven(i)) {
                r += i + "\n";
            }
            i++;
        }

        return r;
    }

    public String randomEven(int num) {
        int i = 0;
        String r = "";
        while (i<num) {
            int ra = (int)(Math.random()*(maximum-minimum+1) +minimum);
            if (isEven(ra)) {
                r+=ra+"\n";
                i++;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        EvenOdd e = new EvenOdd();
        System.out.print("Enter the minimum: ");
        e.setMinimum(kb.nextInt());
        System.out.print("Enter the maximum: ");
        e.setMaximum(kb.nextInt());
        System.out.println("Even Numbers3\n"+e.evenBetween());
        System.out.println(e.randomEven(5));


    }

}
