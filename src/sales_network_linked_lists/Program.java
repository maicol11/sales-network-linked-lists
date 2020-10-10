package sales_network_linked_lists;

public class Program {

	public static void main(String[] args) {
		Companie c1 = new Companie("My company", 1000, 10, 25);
		Seller s2 = new Seller("Maria");
		Seller s1R1 = new Seller("Seller R1");
		Seller s1R2 = new Seller("Seller R2");
		Seller s1R1R1 = new Seller("s1R1R1");
		Seller s1R1R2 = new Seller("s1R1R2");
		
		Seller segundo = new Seller("segunda network");
		
		c1.addSeller(s2);
		
		c1.addSeller(segundo);
		
		//s1.right = s2;
		
		s2.right = s1R1R1;
		s2.left = s1R1;
		
		s1R1R1.right = s1R2;
		
		System.out.println(s2.name + " balance: " + c1.sellerBalance2(s2));
		
		c1.totalBalance(s2);
		
		c1.allNetworkBiggerBalance();
		c1.allNetWorkSmallerBalance();
		
		
		
	}

}
