import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int i=1;
 
 while(i<=n) {
	 int k=n-i;
	 while(k>=1) {
		 System.out.print(" ");
		 k--;
	 }
	 int j=1;
	 int t=i;
	 while(j<=i) {
		 System.out.print(t);
		 t++;
		j++ ;
	 }   
	 
	 int l=2*i-2;
	 int e=2;
	 while(e<=i){
	System.out.print(l);
	l--;
	e++;
	
	
	 }
	 
	 System.out.println("");
	 i++;
	 
 }
	}

}
/* Your class should be named Solution.
	* Read input as specified in the question.
	* Print output as specified in the question.
*/
