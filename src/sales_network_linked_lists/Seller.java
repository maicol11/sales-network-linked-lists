package sales_network_linked_lists;


public class Seller {
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	String name;
	float totalSales;
	Seller right;
	
	
	Seller(String nameValue, float totalSalesValue) {
		name = nameValue;
		totalSales = totalSalesValue;
	}
	
	
	
	
}
