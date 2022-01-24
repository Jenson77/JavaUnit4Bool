package ComparingObjects;

public class ComparingObjects {

    public static void main(String[] args) {
        String w1 = "Program";
        String w2 = "Program";

        String w3 = new String ("Program");
        String w4 = new String ("Program");

        boolean isTheSame1 = w1 == w2;
        boolean isTheSame2 = w1.equals(w2);
        System.out.println(""+isTheSame1+isTheSame2);
        boolean isTheSame3 = w3 == w4;
        boolean isTheSame4 = w3.equals(w4);
        System.out.println(""+isTheSame3+isTheSame4);
    }

}
