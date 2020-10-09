package sales_network_linked_lists;

public class Program {

	public static void main(String[] args) {
		Companie c1 = new Companie();
		c1.name = "Emp1";
		SellerList sellerList = new SellerList();
		Seller s1 = new Seller("Seller 1", 80.200f);
		
		sellerList.addSeller(s1);

		Seller s2 = new Seller("s2 hijo de seller 1", 45.100f);
		//sellerList.addSeller(s2);

		c1.sellers = sellerList;
		//c1.sellers.showAll();
		c1.sellers.bestSeller();
		c1.sellers.totalSales();
		
		Seller s1R1 = new Seller("Seller R1",  80.200f);
		
		Seller s1R2 = new Seller("Seller R2",  80.200f);
		
		SellerList sellerListR = new SellerList();
		
		sellerListR.addSeller(s1R1);
		sellerListR.addSeller(s1R2);
		
		//s1.sellersRight.showAll();
		
		Seller s1R1R1 = new Seller("s1R1R1 hijop de Seller s2",  80.200f);
		Seller s1R1R2 = new Seller("s1R1R2 hijo de seller  s1R1R1",  80.200f);
		
		SellerList sellerLists1R1 = new SellerList();
		
		sellerLists1R1.addSeller(s1R1R1);
		sellerLists1R1.addSeller(s1R1R2);
		//s1R1.sellersRight.showAll();
		
		//s1.sellersRight.showAll();
		
		s1.right = s2;
		
		s2.right = s1R1R1;
		
		s1R1R1.right = s1R1R2;
		
		//c1.sellers.showAllTwo();
		
		c1.showAllFour(s1R1R1);

		
		
		
		
	}

}
