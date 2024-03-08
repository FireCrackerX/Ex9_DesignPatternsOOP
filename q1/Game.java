public abstract class Game {	
	protected abstract void initializeGame();
	protected abstract void playingGame();
	protected abstract void showResult();
	
	public final void play() {
		initializeGame();
		playingGame();
		showResult();
	}
}
