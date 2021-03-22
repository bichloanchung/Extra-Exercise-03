
public class Main {

	public static void main(String[] args) {
		//Dice dice = new Dice(0);
		Game game = new Game();
		
		game.requestPlayerNames();
		game.requestPlayerThrows(game.firstPlayer);
		//System.out.println(game.firstPlayer.getName()+ " , that was your last throw! You got: "+game.firstPlayer.getTotalPoints()+" points!");
		game.requestPlayerThrows(game.secondPlayer);
		
		game.comparePointsOfPlayers(game.firstPlayer, game.secondPlayer);

	}

}
