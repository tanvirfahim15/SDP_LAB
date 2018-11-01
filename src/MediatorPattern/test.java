package MediatorPattern;

public class test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Tire tire = new Tire(mediator);
        Hub hub= new Hub(mediator);
        Spoke spoke = new Spoke(mediator);

        tire.changeRadius(100);
        hub.changeRadius(20);
        spoke.changeRadius(80);
        System.out.println(tire.changeRadius(200));

        System.out.println(tire);
        System.out.println(hub);
        System.out.println(spoke);

    }
}
