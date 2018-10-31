package exam.Strategy;

public class NoFly implements Flybehaviour {

    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}
