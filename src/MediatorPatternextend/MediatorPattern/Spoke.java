package MediatorPatternextend.MediatorPattern;

public class Spoke implements Component{
    private final Mediator mediator;
    private int radius;

    public Spoke(Mediator mediator) {
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
        return "Spoke{" +
                "radius=" + radius +
                '}';
    }
}
