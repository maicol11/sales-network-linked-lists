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
	
	
	float sellerBalance2(Seller seller) {
		
		float generalBalance = membershipInitialFee - ((membershipInitialFee*membershipDiscountPercentaje) / 100);
		
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
		
		Seller tmpRight = seller.right;
		if(tmpRight != null) {
			float rightCommission = 0;
			while(tmpRight.right != null) {
				rightCommission += (generalBalance*commissionProfitPercentaje) / 100;
				tmpRight = tmpRight.right;
			}
			float tmpBalanceRight = generalBalance + rightCommission;
			
			balance += (tmpBalanceRight*25)/100;		
		}
		
		return balance;	
	}
	
	void totalBalance(Seller seller) {
		
		float balance = sellerBalance2(seller);	
		Seller tmpright = seller.right;
		float balance2 = 0;
		while(tmpright != null) {
			balance2 += sellerBalance2(tmpright);
			tmpright = tmpright.right;	
		}
		
		Seller tmpleft = seller.left;
		float balance3 = 0;
		while(tmpleft != null) {
			balance3 += sellerBalance2(tmpleft);
			
			tmpleft = tmpleft.left;
		}
		float total = balance + balance2 + balance3;
		
		System.out.println("total: " + total);
		
	}
	
	float biggerBalance(Seller seller) {
		
		float balance = sellerBalance2(seller);
		
		Seller tmpright = seller.right;
		
		float balance2 = 0;
		float tmp = balance;
		while(tmpright != null) {
			float balancetmp = sellerBalance2(tmpright);
			
			if(balancetmp > tmp ) {
				
				tmp = balancetmp;
			}
			tmpright = tmpright.right;
			
		}
		
		Seller tmpleft = seller.left;

		while(tmpleft != null) {
			float balance3 = sellerBalance2(tmpleft);
			if(balance3 > tmp ) {
				
				tmp = balance3;
			}
			tmpleft = tmpleft.left;
			
		}

		
		return tmp;
		
	}
	
	float smallBalance(Seller seller) {
		
		float balance = sellerBalance2(seller);
		
		Seller tmpright = seller.right;

		float tmp = balance;
		while(tmpright != null) {
			float balancetmp = sellerBalance2(tmpright);
			
			if(balancetmp < tmp ) {
				
				tmp = balancetmp;
			}
			tmpright = tmpright.right;
			
		}
		
		Seller tmpleft = seller.left;

		while(tmpleft != null) {
			float balance3 = sellerBalance2(tmpleft);
			if(balance3 > tmp ) {
				
				tmp = balance3;
			}
			tmpleft = tmpleft.left;
			
		}

		return tmp;
		
	}
	
	void allNetworkBiggerBalance() {
		SellerNode tmp = sellers.head;
		
		float bigger = 0;
		while(tmp != null) {
			float prueba = biggerBalance(tmp.value);
			if(prueba > bigger) {
				bigger = prueba;
				
			}
			
			tmp = tmp.next;
		}
		
		System.out.println("Balance mayor: " + bigger);
	}
	
	void allNetWorkSmallerBalance() {
		SellerNode tmp = sellers.head;
		
		float small = smallBalance(tmp.value);
		while(tmp != null) {
			float prueba = smallBalance(tmp.value);
			if(prueba < small) {
				small = prueba;
				
			}
			
			tmp = tmp.next;
		}
		
		System.out.println("Balance menor: " + small);
	}
	
	
	
	
}