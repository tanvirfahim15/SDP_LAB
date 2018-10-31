package sdp_lab_06.CommandPattern;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("Light1");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.undoWasPressed();

        simpleRemoteControl.setSlot(lightOffCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.undoWasPressed();
    }
}
