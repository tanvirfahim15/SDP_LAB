package MediatorPattern;

public class Hub {
    private final Mediator mediator;
    private int radius;

    public Hub(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setHub(this);
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
        return "Hub{" +
                "radius=" + radius +
                '}';
    }
}
