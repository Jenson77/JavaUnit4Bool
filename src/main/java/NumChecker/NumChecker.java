package NumChecker;

public class NumChecker {
    double number;

    public NumChecker (double number) {
        this.number = number;
    }


    public void suquaredCubed () {
        if (number % 2 == 0) {
            number = Math.pow(number, 2);
        }
        else {
            number = Math.pow (number, 3);
        }
    }

    public String getSmallBig () {
        if (number >= 50) {
            return "BIG";
        }
        else
            return "SMALL";
    }

    public boolean randomCheckeck (double min, double max) {
        double randomNumber = (max - min + 1) * Math.random () + min;
        if (Math.abs(randomNumber - number) <= 50 ) {
            return true;
        }
        else {
            return false;
        }
    }
        //add a constructor to set the initial state of number
        //if number is even, the number is squared
        //if number is odd, the number is  cubed
        //if number is above 50, returns “BIG”
        //if below 50, returns “small”
        // takes in min and max integers,
        // generates random number between min and max
        // if the random number is within 50-point range
        // from the number, returns true, false otherwise
        // number 100, random number is 149 = true
        // number 100, random number is 56 = true
        // number 100, random number is 43 = false
        // checks the random number if it is within the range of the number




}
