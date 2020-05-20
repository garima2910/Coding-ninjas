import java.util.Scanner;

public class Largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b&&a>=c) {
			System.out.println("A is largest of three numbers");
			
		}else
			if(b>=a&&b>=c) {
				System.out.println("B is largest of three numbers");
			}
			else {
				System.out.println("C is largest of three numbers");
			}
	}

}
