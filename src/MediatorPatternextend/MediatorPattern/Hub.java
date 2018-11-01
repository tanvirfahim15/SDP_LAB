package MediatorPatternextend.MediatorPattern;

public class Hub implements Component{
    private final Mediator mediator;
    private int radius;

    public Hub(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setComponent(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean changeRadius(int radius) {
        return this.mediator.set(this,radius);
    }

    @Override
    public String toString() {
        return "Hub{" +
                "radius=" + radius +
                '}';
    }
}
