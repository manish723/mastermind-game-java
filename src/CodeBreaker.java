import java.util.Scanner;

public class CodeBreaker {
	
	private Code guessCode;

	public CodeBreaker() {
		guessCode = new Code();
	}

	public Code getGuessCode() {
		return guessCode;
	}

	public void setGuessCode(Code guessCode) {
		this.guessCode = guessCode;
	}
	
	public void getGuessCodeInput() {
		Scanner inputScanner = new Scanner(System.in);
		if(guessCode == null) {
			guessCode = new Code();
		}
		guessCode.setPegs(inputScanner.nextInt(),
				inputScanner.nextInt(), 
				inputScanner.nextInt(), 
				inputScanner.nextInt());
		//inputScanner.close();
	}

}
