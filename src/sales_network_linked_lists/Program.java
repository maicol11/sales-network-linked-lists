package sales_network_linked_lists;

public class Program {

	public static void main(String[] args) {
		Companie c1 	= new Companie("My company", 1000, 10, 25);
		Seller s2 		= new Seller("Maria");
		Seller s1R1 	= new Seller("Pedro");
		Seller s1R2 	= new Seller("Juan");
		Seller s1R1R1 	= new Seller("Carlos");
		Seller s1R1R2 	= new Seller("Miguel");
		Seller s1R1L2 	= new Seller("Luis");
		Seller r1l1   	= new Seller("Maicol");
		Seller r1l2   	= new Seller("Cristian");
		Seller s1R2R2   = new Seller("Alejandra");
		Seller s1R2R3   = new Seller("Helena");
		
		Seller segundo 	= new Seller("segunda network");
		
		c1.addSeller(s2);
		
		c1.addSeller(segundo);
		
		//s1.right = s2;
		
		s2.right = s1R1R1;
		s2.left  = s1R1;
		
		s1R1R1.right 	= s1R2;
		s1R2.right  	= s1R1R2;
		s1R2.left 		= s1R1L2;
		s1R1L2.left 	= r1l1;
		r1l1.right 		= r1l2;
		r1l2.left 		= s1R2R2;
		r1l2.right 		= s1R2R3;
		
		System.out.println(s2.name + " balance: " + c1.sellerBalance2(s2));
		c1.totalBalance(s2);
		c1.allNetworkBiggerBalance();
		c1.allNetWorkSmallerBalance();
		
		
		
	}

}
