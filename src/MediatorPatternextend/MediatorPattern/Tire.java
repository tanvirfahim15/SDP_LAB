package MediatorPatternextend.MediatorPattern;

public class Tire implements Component{
    private final Mediator mediator;
    private int radius;

    public Tire(Mediator mediator) {
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
        return "Tire{" +
                "radius=" + radius +
                '}';
    }
}
