package calculator;

public class Subtraction {
	double num1;
	double num2;
	double result;
	
	public Subtraction() 
	{
	}
	
	public Subtraction(double n1, double n2) 
	{
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public double minus (double n1, double n2)
	{
		num1 = n1;
		num2 = n2;
		result = num1 - num2;
		return result;
	}
}
