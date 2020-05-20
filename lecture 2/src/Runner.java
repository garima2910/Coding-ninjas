import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(highestOccuringCharacter(input));
	}
	public static char highestOccuringCharacter(String inputString) {
		int n=inputString.length();
		int count=0;
		char c='\0';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(inputString.charAt(i)==inputString.charAt(j)) {
					count++;
					int max=count;
				 c=inputString.charAt(i);
				}
		}
		}
		return c;
	}
}
