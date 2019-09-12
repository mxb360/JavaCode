class Player {
	int guessNumber;
	String guessRightString;

	public void guess() {
		guessNumber = (int)(Math.Random()*10);	
	}

	public void rightString(String guessRightString) {
		this.guessRightString = guessRightString;
	}
	public String getRightString() {
		return guessRightString;
	}
}

class GuessNumberGame{
	int number;
	Player player1;
	Player player2;
	Player player3;

	public setNumber() {
		number = (int)(Math.Random()*10);
	}

	public void setPlayer() {
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
	}

	public void guess() {
		player1.guess();
		player2.guess();
		player3.guess();
	}

	public rate() {
		if(player1.guessNumber == number)
			player1.rightString("�¶���");
		else
			player1.rightString("û�в¶�");
		if(player2.guessNumber == number)
			player2.rightString("�¶���");
		else
			player2.rightString("û�в¶�");
		if(player3.guessNumber == number)
			player3.rightString("�¶���");
		else
			player3.rightString("û�в¶�");	
	}


}

public class GuessNumberLauncher {
	public static void main(String[] args) {
		GuessNumberGame game = new GuessNumberGame();
		game.start();
	}
}
