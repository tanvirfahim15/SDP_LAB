package exam.Strategy;

public class WingFlyMuteDuck extends Duck {

    public WingFlyMuteDuck() {
        setFlybehaviour(new FlyWithWings());
        setQuackbehaviour(new QuackMute());
    }

    @Override
    public void display() {
        System.out.println("WingFlyMuteDuck");
    }
}
