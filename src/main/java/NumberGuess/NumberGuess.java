package NumberGuess;

import javafx.scene.control.Label;

public class NumberGuess {
    private Number input;
    private Number number;
    private int trial;

    public NumberGuess () {
        number = new Number();
        trial = 1;
    }

    public Number getInput() {
        return input;
    }

    public void setInput(Number input) {
        this.input = input;
    }


    public void newInput (String input) {
        trial++;
        this.input = new Number (input);
    }

    public Label[] process () {
        Label [] r = new Label [2];
        r [0] = new Label (""+input.getOneDigit());
        r[1] = new Label (""+input.getTwoDigit());
        if (number.contains(input.getOneDigit())) {
            if (number.getOneDigit()==input.getOneDigit()) {
                r[0].setTextFill(Colors.GREEN);
            }
            else {
                r[0].setTextFill(Colors.YELLOW);
            }
        }
        if (number.contains(input.getTwoDigit())) {
            if (number.getTwoDigit()==input.getTwoDigit()) {
                r[1].setTextFill(Colors.GREEN);
            }
            else {
                r[1].setTextFill(Colors.YELLOW);
            }
        }
        return r;

    }





}
