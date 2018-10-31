package exam.Strategy;

public abstract class Duck {
    private Flybehaviour flybehaviour=null;
    private Quackbehaviour quackbehaviour=null;

    public Flybehaviour getFlybehaviour() {
        return flybehaviour;
    }

    public void setFlybehaviour(Flybehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public Quackbehaviour getQuackbehaviour() {
        return quackbehaviour;
    }

    public void setQuackbehaviour(Quackbehaviour quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }

    public void fly(){
        flybehaviour.fly();
    }

    public void quack(){
        quackbehaviour.quack();
    }

    public abstract void display();
}
