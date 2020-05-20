import java.util.Scanner;

public class Solution {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		tripletSum(input, x);
	}
	public static void tripletSum(int[] input, int x){
        int l=input.length;
        int temp = 0;
        for (int i = 0; i < input.length; i++) {     
            for (int j = i+1; j < input.length; j++) {     
               if(input[i] > input[j]) {    
                   temp = input[i];    
                   input[i] = input[j];    
                   input[j] = temp;    
               }     
            }     
        }    
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                for(int k=j+1;k<l;k++){
                    if(input[i]+input[j]+input[k]==x){
                      if(input[i]<input[j]&&input[j]<input[k]){ 
                            System.out.println(input[i]+" "+input[j]+" "+input[k]);
                         
                      } 
                        
            }
        }
            }
        }
		
	}
}