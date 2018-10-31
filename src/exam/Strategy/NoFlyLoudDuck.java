package exam.Strategy;

public class NoFlyLoudDuck extends Duck {

    public NoFlyLoudDuck() {
        setFlybehaviour(new NoFly());
        setQuackbehaviour(new QuackLoud());
    }

    @Override
    public void display() {
        System.out.println("NoFlyLoud");
    }
}
