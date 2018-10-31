package exam.Strategy;

public class test {
    public static void main(String[] args) {
        Duck duck = new WingFlyMuteDuck();
        duck.display();
        duck.fly();
        duck.quack();
        System.out.println("");
        duck = new NoFlyLoudDuck();
        duck.display();
        duck.fly();
        duck.quack();
    }
}
