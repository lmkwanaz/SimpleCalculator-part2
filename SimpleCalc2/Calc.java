import java.util.*;

public class Calc{

	public double status(double first, double second){

		Scanner scan = new Scanner(System.in);
		int select;
		//double first;
		//double second;

		System.out.println("which one do you wanna use?");
		System.out.println("1. *"+"\n"+
				"2. +"+"\n"+
				"3. /"+"\n"+
				"4. -"+"\n"+
				"5. %"+"\n");
		select = scan.nextInt();

		Calc calculator = new Calc();

		double result = 0;

		switch(select){

			case 1:
		
				result = Multiple(first, second);
				
				break;
			case 2:
				result = calculator.Add(first, second);
				break;
			case 3:
				result = calculator.Divide(first, second);
				break;
			case 4:
				result = calculator.Minise(first, second);
				break;
			case 5:
				result = calculator.Moduluse(first, second);
				break;
			default:
				System.exit(0);
		}

		//System.out.println(select);

		return result;
	}

	public double Multiple(double first, double second){
			double res = 0;
			res = first * second;
			return res;
	}

	 public double Add(double first, double second){

                        return first + second;
        }

	 public double Minise(double first, double second){

                        return first - second;
        }


	 public double Moduluse(double first, double second){

                        return first % second;
        }


	 public double Divide(double first, double second){

                        return first / second;
        }




}
