import java.util.Scanner;

public class Game {

	public Player firstPlayer, secondPlayer;
	Scanner sc = new Scanner(System.in);

	public void requestPlayerNames() {
		
		System.out.println("Enter the name of the first player!");
		this.firstPlayer = new Player(sc.nextLine());
		System.out.println("Enter the name of the second player!");
		this.secondPlayer = new Player(sc.nextLine());
	}
	
	public void requestPlayerThrows(Player pl) {
		Dice dice = new Dice(0);
		System.out.println("################  "+pl.getName()+"  #############");

		for (int i = 0; i < 3; i++) {
			System.out.println(pl.getName()+" , Please press ENTER to throw the dice ...");
			System.out.print(pl.getName()+" , you got: ");
			dice.throwDice();
			int currentPnt = dice.getValue();
			int savedPnt = pl.getTotalPoints();
			pl.setTotalPoints(currentPnt + savedPnt);
			sc.nextLine();
		}
		System.out.println();
		System.out.println(pl.getName()+ " , that was your last throw! You got: "+pl.getTotalPoints()+" points!");
		
	}
	public void comparePointsOfPlayers(Player firstPlayer, Player secondPlayer) {
		System.out.println("#########  "+firstPlayer.getName() + " Vs. "+secondPlayer.getName()+" ############");
		if(firstPlayer.getTotalPoints() > secondPlayer.getTotalPoints()) {
			System.out.println(firstPlayer.getName()+" won the game!");
		}else
			System.out.println(secondPlayer.getName()+" won the game!");
	}
	public void runGame() {
		requestPlayerNames();
		requestPlayerThrows(firstPlayer);
		requestPlayerThrows(secondPlayer);
		comparePointsOfPlayers(firstPlayer, secondPlayer);
		
		
	}
	
	
	
	

}
