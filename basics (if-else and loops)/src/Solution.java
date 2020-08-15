import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseEachWord(input));
	}
	public static String reverseEachWord(String input) {
		// Write your code here
      int start=0;
        String reverseString = "";
        for(int i=0;i<input.length();i++) {
        	if(input.charAt(i)==' ') {
        		for(int j=i-1;j>=start;j--) {
        			reverseString=reverseString+input.charAt(j);
        		}
        		 start=start+i;
        }
        	    
}
       
        return reverseString; 
}}