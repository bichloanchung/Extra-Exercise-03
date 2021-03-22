import java.util.Random;

public class Dice {
	private int value;
	
	public Dice(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void throwDice() {
		Random rd = new Random();
		this.value = rd.nextInt(6)+1;
		System.out.print(getValue());
	}

}
