package listinpdf;
import java.util.Scanner;
public class Elictricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you unit:");
		int u = sc.nextInt();
		final int r = 10;
		System.out.println("Ele bill is:"+(u  * r) );
	}

}
