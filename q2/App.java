public class App {
    public static void main(String[] args) {
        Game football = new Football();
        Game basketball = new Basketball();

        football.play();
        basketball.play();
    }
}