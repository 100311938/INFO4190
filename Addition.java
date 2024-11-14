package calculator;

public class Addition {
	
	double num1;
	double num2;
	double result;
	
	public Addition() 
	{
	}
	
	public  Addition(double n1, double n2) 
	{
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public double add (double n1, double n2)
	{
		num1 = n1;
		num2 = n2;
		result = num1 + num2;
		return result;
	}
}
