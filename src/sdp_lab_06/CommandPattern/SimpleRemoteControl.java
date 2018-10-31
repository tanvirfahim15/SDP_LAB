package sdp_lab_06.CommandPattern;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
    public void undoWasPressed(){
        slot.undo();
    }
}
