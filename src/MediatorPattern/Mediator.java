package MediatorPattern;

public class Mediator {
    Hub hub;
    Tire tire;
    Spoke spoke;

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public boolean setRadius(Hub hub, int radius){
        if(tire==null||radius<this.tire.getRadius()){
            this.hub.setRadius(radius);
            this.spoke.setRadius(this.tire.getRadius()-this.hub.getRadius());
            return true;
        }

        return false;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public boolean setRadius(Tire tire, int radius){
        if(hub==null||radius>this.hub.getRadius()){
            this.tire.setRadius(radius);
            this.spoke.setRadius(this.tire.getRadius()-this.hub.getRadius());
            return true;
        }

        return false;
    }

    public void setSpoke(Spoke spoke) {
        this.spoke = spoke;
    }

    public boolean setRadius(Spoke spoke, int radius){
        if(tire==null||hub==null||tire.getRadius()-hub.getRadius()==radius){
            spoke.setRadius(radius);
            return true;
        }
        return false;
    }

}
