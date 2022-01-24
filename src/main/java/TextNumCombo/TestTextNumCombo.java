package TextNumCombo;

class TestTextNumCombo{
    public static void main(String[] args) {
        TextNumCombo lc = new TextNumCombo("Marilou");

        System.out.println("Checking if 3-digit number & with even digits");
        System.out.println("------------------------");
        System.out.println(lc.isDigitEven(345)); // false - two of the digits are odd
        System.out.println(lc.isDigitEven(246)); // true
        System.out.println(lc.isDigitEven(236)); // false - one of the digits is odd
        System.out.println("");

        System.out.println("Number combination");
        System.out.println("------------------------");
        System.out.println(lc.getNumCombo(246, 7, 100));  // Prints a number combination e.g. 24617
        System.out.println(lc.getNumCombo(246, 50, 200)); // 0 - max is > 100
        System.out.println(lc.getNumCombo(236, 50, 100)); // 0 - one of the digits of num is odd
        System.out.println(lc.getNumCombo(246, 100, 50)); // 0 - min is > max
        System.out.println(lc.getNumCombo(246, 20, 80));  // Prints a number combination e.g. 24625
        System.out.println(lc.getNumCombo(842, 10, 10));  // 0 - min and max are the same
        System.out.println("");

        System.out.println("Making text number combo #1");
        System.out.println("------------------------");
        System.out.println(lc.makeTextNumCombo(246));     // makes a text combo e.g 2461LOU, 2462MARILOU
        System.out.println(lc.makeTextNumCombo(844));     // makes a text combo e.g. 8441U, 8443ILOU
        System.out.println("");

        System.out.println("Making text number combo #2");
        System.out.println("------------------------");
        System.out.println(lc.makeTextNumCombo(756));     // some digits are odd numbers, prints null
    }
}

