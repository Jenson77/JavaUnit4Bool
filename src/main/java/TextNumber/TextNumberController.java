package TextNumber;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class TextNumberController {

    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    private String text;



    @FXML
    protected void onButtonReverseTextClick() {
        retrieveText();
        String s = "";
        int l = text.length();
        for (int i = l-1; 0<=i; i--) {
            s += text.charAt(i);
        }
        textArea.setText(s);
    }


    @FXML
    protected void onButtonCountVowelsClick() {
        retrieveText();
        textArea.setText(""+vowelCount(text));
    }

    @FXML
    protected void onButtonResetClick() {
        textArea.clear();
        textField.clear();
        text = null;
    }

    @FXML
    protected void onButtonDigitSumClick() {
        retrieveText();
        int l = text.length();
        int r = 0;
        boolean checker = true;
        for (int i = 0; i < l; i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                r+=Integer.parseInt(""+c);
            }
            else {
                checker = false;
                Alert alert = new Alert (Alert.AlertType.ERROR);
                alert.setContentText("Only Digits for sum");
                alert.show();
                break;
            }
        }
        if (checker) {
            textArea.setText("" + r);
        }
    }


    private void retrieveText () {
        text  = textField.getText();
    }

    private int vowelCount(String s) {
        s = s.toLowerCase();
        int l = s.length();
        int r = 0;
        for (int i = 0; i < l; i++) {
            if (isVowel(s.charAt(i))) {
                r++;
            }
        }
        return r;
    }



    @FXML
    protected void onKeyPressed (KeyEvent event) {
        if (event.isControlDown()) {
            if (event.getCode().equals(KeyCode.R)) {
                onButtonResetClick();
            } else if (event.getCode().equals(KeyCode.T)) {
                onButtonReverseTextClick();
            } else if (event.getCode().equals(KeyCode.D)) {
                onButtonDigitSumClick();
            } else if (event.getCode().equals(KeyCode.V)) {
                onButtonCountVowelsClick();
            }
        }
    }



    private boolean isVowel (char c) {
        return (c==97 || c == 101 || c == 105 || c == 111 || c == 117);
    }




}
