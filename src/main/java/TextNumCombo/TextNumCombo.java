package TextNumCombo;

public class TextNumCombo {

    private String text;

    public TextNumCombo (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDigitEven (int num) {
        boolean r = (num % 100 != 0) && (num % 10 != 0) && (num > 221) && (num < 889) && (num%2 == 0) &&
                ((num/10) % 2 == 0) && ((num/100)%2==0);
        return r;
    }

    public int getNumCombo(int num, int min, int max){

        if (isDigitEven(num)) {
            return Integer.parseInt(""+num+(int) (Math.random() * (max - min + 1) + min));
        }
        return 0;
    }

    public String makeTextNumCombo (int num) {
        if (isDigitEven(num)) {
            int l = text.length();
            return "" + num + (int) (Math.random()*l)+ text.substring((int)Math.random()*l);
        }
        return null;
    }

}
