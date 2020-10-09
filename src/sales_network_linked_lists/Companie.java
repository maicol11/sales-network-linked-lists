package sales_network_linked_lists;

public class Companie {
	String name;
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	SellerList sellers;
	
	Companie(String v1, float v2, float v3, float v4) {
		name 							= v1;
		membershipInitialFee		 	= v2;
		membershipDiscountPercentaje 	= v3;
		commissionProfitPercentaje   	= v4;
		
		sellers = new SellerList();
	}
	
	void addSeller(Seller s) {
		sellers.addSeller(s);
	}
	
	
	
	void sellerBalance(Seller seller) {
		
		float generalBalance = membershipInitialFee - ((membershipInitialFee*membershipDiscountPercentaje) / 100);
		Seller tmpRight = seller.right;
		float balance = generalBalance;
		float prueba = 0;
		while(tmpRight != null) {
			
			balance += (generalBalance*commissionProfitPercentaje) / 100;
			prueba += (generalBalance*commissionProfitPercentaje) / 100;
			System.out.println("prueba: " + prueba);
			tmpRight = tmpRight.right;
			
		}
		
		System.out.println(seller.name + "'s balance " + balance);		
	}
	
	
	
	void sellerBalance2(Seller seller) {
		
		float generalBalance = membershipInitialFee - ((membershipInitialFee*membershipDiscountPercentaje) / 100);
		Seller tmpRight = seller.right;
		float balance = generalBalance;

		
		Seller tmpLeft = seller.left;
		if(tmpLeft != null) {
			float leftCommission = 0;
			while(tmpLeft.left != null) {
				leftCommission += (generalBalance*commissionProfitPercentaje) / 100;
				tmpLeft = tmpLeft.left;
			}
			float tmpBalance = generalBalance + leftCommission;
			balance += (tmpBalance*25)/100;		
		}
		
		if(tmpRight != null) {
			float rightCommission = 0;
			while(tmpRight != null) {
				rightCommission += (generalBalance*commissionProfitPercentaje) / 100;
				tmpRight = tmpRight.right;
			}
			float tmpBalanceRight = generalBalance + rightCommission;
			balance += (tmpBalanceRight*25)/100;		
		}
		
		System.out.println(seller.name + "'s balance " + balance);		
	}
	
	
}