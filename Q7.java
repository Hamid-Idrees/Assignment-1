public class Q7{
	static public void main(String []args){
		
		int num = 12345;
		int sum = 0;
		
		while (num > 0)
		{
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.print("sum of digits of 12345 is: " + " " + sum);
	}
}