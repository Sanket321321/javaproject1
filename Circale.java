package listinpdf;
import java.util.*;
public class Circale {

	public static void main(String[] args) {
		
		int r;
        double pi = 3.14, area;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("The area of the circle: "+area);
	}

}
