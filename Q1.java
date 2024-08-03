public class Q1{
	public static void main(String[]args){
		
		double basicSalary = 105000;
		
		double dearnessAllowance = 0.40 * basicSalary ;
		
		double rentAllowance = 0.20 * basicSalary;
		
		double grossSalary = basicSalary + dearnessAllowance + rentAllowance;
		
		System.out.println("Gross Salary is: " + grossSalary);
		
	}
}