import java.util.Scanner;

public class Game {

	public Player firstPlayer, secondPlayer;

	public void requestPlayerNames() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the first player!");
		this.firstPlayer = new Player(sc.nextLine());
		System.out.println("Enter the name of the second player!");
		this.secondPlayer = new Player(sc.nextLine());
	}
	
	public void requestPlayerThrows(Player pl) {
		Dice dice = new Dice(0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("################  "+pl.getName()+"  #############");

		for (int i = 0; i < 3; i++) {
			System.out.println(pl.getName()+" , Please press ENTER to throw the dice ...");
			System.out.print(pl.getName()+" , you got: ");
			dice.throwDice();
			int currentPnt = dice.getValue();
			int savedPnt = pl.getTotalPoints();
			pl.setTotalPoints(currentPnt + savedPnt);
			scanner.nextLine();
		}
		System.out.println();
		System.out.println(pl.getName()+ " , that was your last throw! You got: "+pl.getTotalPoints()+" points!");
		
	}
	public void comparePointsOfPlayers(String firstPlayer, String secondPlayer) {
		
	}
	public void runGame() {
		
	}
	
	
	
	

}
