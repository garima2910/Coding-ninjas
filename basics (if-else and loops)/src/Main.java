
import java.util.Scanner;


public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		findLargest(input);
		
	}
public static void findLargest(int input[][]){
        int largest1 = Integer.MIN_VALUE;
		int rows = input.length;
		int cols = input[0].length;
		
		for(int j = 0; j < cols; j++){
			int sum = 0;
			for(int i = 0; i < rows; i++){
				sum = sum + input[i][j];
			}
			if(sum > largest1){
				largest1 = sum;
               System.out.println(largest1);
			}
		}
		  int largest2 = Integer.MIN_VALUE;
	for(int i=0;i<rows;i++){
        int sum=0;
        for(int j=0;j<cols;j++){
            sum=sum+input[i][j];
            
        }
        if(sum>largest2){
            largest2=sum;
           
        }
    }	
	 System.out.println(largest2);		

	}
}
