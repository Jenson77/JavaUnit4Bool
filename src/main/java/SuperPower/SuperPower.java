package SuperPower;

public class SuperPower {
    private String name;
    private Power power; // has-a relationship


    public SuperPower(String name, Power power) {
        this.name = name;
        this.power = power.clone(); //alias
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "SuperPower{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
