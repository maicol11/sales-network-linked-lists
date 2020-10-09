package sales_network_linked_lists;

public class Companie {
	String name;
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	SellerList sellers;
	
	Companie(String v1, float v2, float v3, float v4) {
		name 							= v1;
		membershipDiscountPercentaje 	= v2;
		commissionProfitPercentaje   	= v3;
		membershipInitialFee		 	= v4;
	}
	
	
	void showAllFour(Seller seller) {
		
		System.out.println("Nombre: " + seller.name);
		
		Seller tmpRight = seller.right;
		
		while(tmpRight != null) {
			System.out.println("	Right: " + tmpRight.name);
				
			tmpRight = tmpRight.right;
		}
				
	}
}