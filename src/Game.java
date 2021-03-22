
public class Game {
	private String firstPlayer;
	private String secondPlayer;
	
	
	public String getFirstPlayer() {
		return firstPlayer;
	}

	public void setFirstPlayer(String firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public String getSecondPlayer() {
		return secondPlayer;
	}

	public void setSecondPlayer(String secondPlayer) {
		this.secondPlayer = secondPlayer;
	}

	public void requestPlayerNames() {
		System.out.println("Enter the name of 2 player!");
		this.firstPlayer = "Player 1";
		this.secondPlayer = "Player 2";
	}
	
	public void requestPlayerThrows(Player pl) {
		Dice dice = new Dice(0);
		for (int i = 0; i < 3; i++) {
			dice.throwDice();
		}
		
	}
	public void comparePointsOfPlayers(String firstPlayer, String secondPlayer) {
		
	}
	public void runGame() {
		
	}
	
	
	
	

}
