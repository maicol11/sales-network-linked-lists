package sales_network_linked_lists;

public class SellerList {
	SellerNode head;
	
	void addSeller(Seller s) {
		SellerNode newNode = new SellerNode();
		newNode.value = s;
		
		//La lista está vacía
		
		if(head == null){
			head = newNode;
		}
		else { 
			//La lista no está vacía
			
			SellerNode last = head;
			while(last.next != null) {
				last = last.next;			
			}		
			last.next = newNode;
		}
	}
	
	void showAll() {
		SellerNode tmp = head;
		System.out.println("Los nombres de los venderons son:");
		while(tmp != null) {
			System.out.println(tmp.value.name);
			tmp = tmp.next;
		}
	}
	
	void bestSeller() {
		SellerNode tmp = head;
		float totalSale = tmp.value.totalSales;
		SellerNode tmp2 = head;
		while(tmp != null) {
			tmp = tmp.next;
			if(tmp != null) {
				if(totalSale < tmp.value.totalSales) {
					totalSale = tmp.value.totalSales;
					tmp2 = tmp;
				}	
			}else {
				System.out.println("El vendedor con más ventas en la compañia es: "+tmp2.value.name+" ("+tmp2.value.totalSales+")");
			}
		}
	}
	
	void totalSales() {
		SellerNode tmp = head;
		float tSales = 0f;
		while(tmp != null) {
			tSales +=  tmp.value.totalSales;
			tmp = tmp.next;
		}	
		System.out.println("El total de ventas es: " + tSales);
	}
	
	void showAllTwo() {
		SellerNode tmp = head;
		System.out.println("Los nombres de los venderons right son:");
		while(tmp != null) {
			System.out.println(tmp.value.name);
			
			Seller tmpRight = tmp.value.right;
			
			while(tmpRight != null) {
				System.out.println("	Nombre right: " + tmpRight.name);
				
				tmpRight = tmpRight.right;
			}
			
			tmp = tmp.next;
		}
	}
	
}
