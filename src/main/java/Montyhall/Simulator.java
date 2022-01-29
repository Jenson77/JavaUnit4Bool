package Montyhall;
import java.util.Scanner;

public class Simulator {

   private double changeWin=0;
   private double changeLose=0;
   private double stayWin=0;
   private double stayLose=0;
   private int car = 0;
   private int firstGuess = 0;
   private int secondGuess = 0;
   private int reveal = 0;

   protected void reset () {
       car = 0;
       firstGuess = 0;
       secondGuess = 0;
       reveal = 0;
   }

   protected void inputFirstGuess(int fGuess) {
       this.firstGuess = fGuess;
   }

   protected String revealS () {
       return "" +reveal +"door is goat";
   }

   protected void inputSecondGuess (int sGuess) {
       this.secondGuess = sGuess;
   }

   protected String check () {
       return "Door no " +car + " was car";
   }

   protected void setCar () {
       car = randomNum();
   }

   protected void setFirstGuess() {
       firstGuess = randomNum();
   }

   protected void setReveal () {
       boolean cant = true;
       while (cant) {
           reveal = randomNum();
           cant = (reveal==car) || (reveal==firstGuess);
       }
   }

   protected void setSecondGuess () {
       boolean cant = true;
       while (cant) {
           secondGuess = randomNum();
           cant = (secondGuess == reveal);
       }
   }

   protected void sumUp() {
       if (car==secondGuess) {
           if (secondGuess == firstGuess) {
               stayWin++;
           }
           else {
               changeWin++;
           }
       }
       else {
           if (secondGuess == firstGuess) {
               stayLose++;
           }
           else {
               changeLose++;
           }
       }
   }

   protected void repeatProcess (int count) {
       for (int i = 0; i < count; i++) {
           reset();
           setCar();
           setFirstGuess();
           setReveal();
           setSecondGuess();
           sumUp();
       }
   }

   @Override
   public String toString() {
       double changeWinRate = (changeWin) /(changeWin+changeLose);
       double stayWinRate = (stayWin) /  (stayWin+stayLose);
       return "StayWin: " +stayWinRate +"\nChangeWin: "+changeWinRate;
   }

    protected int randomNum() {
        return (int) (Math.random() *3) +1;
    }

    public static void main(String[] args) {
//        Simulator s = new Simulator();
//        Scanner kb = new Scanner (System.in);
//        boolean cont = true;
//        while (cont) {
//            s.reset();
//            s.setCar();
//            System.out.print("Enter your guess: ");
//            s.inputFirstGuess(kb.nextInt());
//            s.setReveal();
//            System.out.println(s.revealS());
//            System.out.print("Enter your second guess: ");
//            s.inputSecondGuess(kb.nextInt());
//            s.sumUp();
//            System.out.println(s.check());
//            System.out.print("Enter 1 to continue, 0 to exit: ");
//            cont = (kb.nextInt()==1);
//        }
//        System.out.println(s);

        Simulator b = new Simulator();
        int count = 1000000;
        b.repeatProcess(count);
        System.out.println(count);
        System.out.println(b);


    }


}
