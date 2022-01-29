package NumberGuess;

public class Number {
    private int oneDigit;
    private int twoDigit;

    public Number(int oneDigit, int twoDigit) {
        this.oneDigit = oneDigit;
        this.twoDigit = twoDigit;
    }

    public Number () {
        oneDigit = (int) (Math.random()*10 +1);
        twoDigit = (int) (Math.random()*10);
    }

    public Number (String num) {
        oneDigit = Integer.parseInt(num.substring(0,1));
        twoDigit = Integer.parseInt(num.substring(1,2));
    }

    public int getOneDigit() {
        return oneDigit;
    }

    public void setOneDigit(int oneDigit) {
        this.oneDigit = oneDigit;
    }

    public int getTwoDigit() {
        return twoDigit;
    }

    public void setTwoDigit(int twoDigit) {
        this.twoDigit = twoDigit;
    }

    public boolean contains (int n) {
        return oneDigit==n || twoDigit == n;
    }



}
