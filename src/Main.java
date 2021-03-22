
public class Main {

	public static void main(String[] args) {
		Dice dice = new Dice(0);
		//dice.throwDice();
		Player pl1 = new Player("Player 1");
		Game game = new Game();
		game.requestPlayerThrows(pl1);
		

	}

}
