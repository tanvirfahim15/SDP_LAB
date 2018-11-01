package MediatorPatternextend.MediatorPattern;

public interface IMediator {
    void setComponent(Component component);
    Boolean set(Component component, int radius);
}
