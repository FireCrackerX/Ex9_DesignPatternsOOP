import java.util.ArrayList;

public class Alarm {
    private ArrayList <IMediator> devices = new ArrayList<IMediator>();

    public Alarm(Sprinkler sprinkler, CoffeePot coffeePot) {
        devices.add(sprinkler);
        devices.add(coffeePot);
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        for(IMediator device: devices) {
            device.doAlarm(this);
        }
    }
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }
}