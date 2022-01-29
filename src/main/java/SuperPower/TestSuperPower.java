package SuperPower;

public class TestSuperPower {

    public static void main(String[] args) {
        Power speed = new Power ("Speed", 10000);
        SuperPower flash = new SuperPower ("Flash", speed);
        SuperPower shazam = new SuperPower("Shazam", speed);
        System.out.println(flash);
        System.out.println(shazam);

        flash.getPower().setStrength(2000000);
        System.out.println(flash);
        System.out.println(shazam);
    }

}
