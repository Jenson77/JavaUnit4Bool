package SuperPower;

public class Power {

    private String name;
    private int strength;

    public Power(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Power{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    public Power clone() {
        return new Power (name, strength);
    }

}
