package sales_network_linked_lists;

public class Program {

	public static void main(String[] args) {
		System.out.print("llego");
		
		Seller s1 = new Seller(14,20,5, "uno");
		Seller s2 = new Seller(14,20,5, "dos");
		Seller s3 = new Seller(14,20,5, "tres");
		Seller s4 = new Seller(14,20,5, "cuatro");
		Seller s5 = new Seller(14,20,5, "quinto");
		Seller s6 = new Seller(14,20,5, "sexto");
		SellerList sellerList = new SellerList();
		
		Seller sellers[] = {s1,s2,s3};
		
		
		sellerList.addSeller(s1,s2,s3);
		
		sellerList.addSeller(s4,s5,s6);
		
		sellerList.showAll();
		
	}

}
