package listinpdf;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;
	    String result;

 result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "is a leap year" : "is not a leap year";

	    System.out.println(year + " " + result + ".");
	  
	
	}

}
