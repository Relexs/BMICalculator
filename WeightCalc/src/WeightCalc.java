import java.util.Scanner;


public class WeightCalc {
	public static void main(String[] args){
		String name;
		String unit;
		float heightM;
		float heightIn;
		float weightKg;
		float weightP;
		float weight;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		name = input.nextLine();
		System.out.println("Welcome " + name);
		
		System.out.println("Do you use Metrics or Imperial?");
		unit = input.nextLine();
		
		if (unit.matches("Metrics|metrics|Metric|metric|M|m")){
			   System.out.println("Ok, we will use Metrics");
			   
			   System.out.println("What is your height in Meters?");
			   heightM  = input.nextFloat();
			   System.out.println("Let's check it out " + heightM);
			   
			   System.out.println("What is your weight in Kilograms?");
			   weightKg = input.nextFloat();
			   System.out.println("Your weight is " + weightKg);
			   
			   weight = weightKg / (heightM * heightM);
			   System.out.println("Your ideal BMI is " + weight);
			   
			}else{
				System.out.println("Ok, we will use Imperial");
				   
				   System.out.println("What is your height in Inches?");
				   heightIn  = input.nextFloat();
				   System.out.println("Let's check it out " + heightIn);
				   
				   System.out.println("What is your weight in Pounds?");
				   weightP = input.nextFloat();
				   System.out.println("Your weight is " + weightP);
				   
				   weight = weightP / (heightIn * heightIn) * 703;
				   System.out.println("Your ideal BMI is " + weight);
			}
	}
}