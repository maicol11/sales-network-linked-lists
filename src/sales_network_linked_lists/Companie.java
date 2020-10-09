package sales_network_linked_lists;

public class Companie {
	String name;
	String nit;
	SellerList sellers;
	
	void showAllThree(Seller seller) {
		SellerNode tmp = sellers.head;		
			
			while(tmp != null) {
				Seller tmpRight = tmp.value.right;
				while(tmpRight != null) {
					if(tmp.value.right == seller) {
						System.out.println("Los nombres de los venderons right son:");						
						
						if(tmpRight != null) {
							System.out.println("Padre " + tmpRight.name);
							
							tmpRight = tmpRight.right;
							
							
						}
						
						
					}
					System.out.println("	Nombre right: " + tmpRight.name);
					tmpRight = tmpRight.right;
				}
				
				
				
				tmp = tmp.next;
			}
		
		
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