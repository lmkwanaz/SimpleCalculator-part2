import java.util.*;



public class Main{


	public static void main(String[] args){

		double first, second;
		int select;
		Scanner scan = new Scanner(System.in);
		System.out.println("put first number");
		first = scan.nextDouble();
		System.out.println("put second number");
		second  = scan.nextDouble();
		Calc cal = new Calc();
		
		double res = cal.status(first, second);
		System.out.println("Total = " + res);
	}

}
