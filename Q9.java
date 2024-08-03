public class Q9 {
    public static void main(String[] args) {
        
		int amount =500;
        int hundred = amount / 100;
        amount -= hundred * 100;

        int fifty = amount / 50;
        amount -= amount * 50;

        int ten = amount / 10;

        System.out.println(hundred + "  Hundred");
        System.out.println(fifty + " Fifty");
        System.out.println(ten + " Ten");
    }

}