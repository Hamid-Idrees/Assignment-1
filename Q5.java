public class Q5{
	public static void main(String [] args){
		
		double length=36;
		double breadth=36;
		double radius=36;
		double recA=length*breadth;
		double recP=2*(length+breadth);
		double cirA=Math.PI*radius*radius;
		double cirC=2*Math.PI*radius;
		
		System.out.println("Rectangle Area: " + recA);
        System.out.println("Rectangle Perimeter: " + recP);
        System.out.println("Circle Area: " + cirA);
        System.out.println("Circle Circumference: " + cirC);
    }
}