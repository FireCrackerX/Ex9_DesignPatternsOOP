public class CoffeePot implements IMediator{
    public void doAlarm(Alarm alarm) {
        System.out.println("I am coffe pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }
}
