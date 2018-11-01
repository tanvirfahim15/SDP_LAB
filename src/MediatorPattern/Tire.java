package MediatorPattern;

public class Tire {
    private final Mediator mediator;
    private int radius;

    public Tire(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setTire(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean changeRadius(int radius) {
        return this.mediator.setRadius(this,radius);
    }

    @Override
    public String toString() {
        return "Tire{" +
                "radius=" + radius +
                '}';
    }
}
