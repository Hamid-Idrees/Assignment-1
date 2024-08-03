public class Q8{
	static public void main(String []args){
		
		double perMen = 52;
		double perliteracy = 48;
		double perLiterateMen = 35;
		int totalPopulation = 80000;
		
		double totalMen = totalPopulation * perMen / 100;
		double totalWomen = totalPopulation - totalMen;
		
		double totalLiterateMen = totalPopulation * (perLiterateMen / 100.0);
		double totalIlliterateMen = totalMen - totalLiterateMen;
		
		double totalLiteratepeople = totalPopulation * perliteracy / 100;
		
		double totalLiteratewomen = totalLiteratepeople - totalLiterateMen;
		double totalIlliteratewomen = totalWomen - totalLiteratewomen;
		
		System.out.println("No of illiterate men: " + totalIlliterateMen);
        System.out.println("No of illiterate women: " + totalIlliteratewomen);
	}
}