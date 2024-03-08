public class Sprinkler implements IMediator{
    @Override
    public void doAlarm(Alarm alarm) {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }
}
