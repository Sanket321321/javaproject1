package listinpdf;
import java.util.*;
public class Scann {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        System.out.println("enter an integer");
		int i = sc.nextInt();
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();
		
		int sum = i + i1 + i2 + i3 +i4;
	System.out.println("average is"+sum/5);
	}

}

