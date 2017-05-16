import java.util.Random;
import java.io.Console;

public class Convert {
	
	private String getType() {
		Random rand = new Random();
		int typeRandom = rand.nextInt(3);
		switch (typeRandom) {
			case 0:
				return "binary";
			case 1:
				return "octal";
			case 2:
				return "hexadecimal";
			default:
				return "something went wrong";
		}
	}
	
	private String getAnswer(String type) {
		Random rand = new Random();
		Console cons = System.console();
		int num = rand.nextInt(16);
		String input = cons.readLine("What is " + num + " converted to " + type + "?\n");
		String rightAnswer = "";
		switch (type) {
			case "binary":
				rightAnswer = "0B" + Integer.toBinaryString(num);
				break;
			case "octal":
				rightAnswer = "0" + Integer.toOctalString(num);
				break;
			case "hexadecimal":
				rightAnswer = "0X" + Integer.toHexString(num);
				break;
		}
		return (input.equalsIgnoreCase(rightAnswer)) ? "correct" : rightAnswer;
	}		
		
	public static void main(String[] args) {
		Convert c = new Convert();
		String type = c.getType();
		String rightAnswer = c.getAnswer(type);
		if (rightAnswer == "correct") {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong, the correct answer is " + rightAnswer);
		}
	}
}
