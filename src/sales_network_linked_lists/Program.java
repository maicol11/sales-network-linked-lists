package sales_network_linked_lists;

public class Program {

	public static void main(String[] args) {
		Companie c1 = new Companie("My company", 1000, 10, 25);
		Seller s1 = new Seller("Seller 1", 80.200f);
		Seller s2 = new Seller("s2 hijo de seller 1", 45.100f);
		
		Seller s1R1R1 = new Seller("s1R1R1 hijop de Seller s2",  80.200f);
		Seller s1R1R2 = new Seller("s1R1R2 hijo de seller  s1R1R1",  80.200f);
		
		s1.right = s2;
		
		s2.right = s1R1R1;
		
		s1R1R1.right = s1R1R2;
		
		c1.showAllFour(s1R1R1);

		
		
		
		
	}

}
