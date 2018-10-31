package exam.Strategy;

public class QuackMute implements Quackbehaviour {

    @Override
    public void quack() {
        System.out.println("Cant quack");
    }
}
