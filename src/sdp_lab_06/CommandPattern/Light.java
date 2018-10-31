package sdp_lab_06.CommandPattern;

public class Light {
    String name;
    boolean on;

    public Light(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        this.on = on;
        System.out.println(name+" on = "+on);
    }

    public void on() {
        this.setOn(true);
    }
    public void off() {
        this.setOn(false);
    }
}
