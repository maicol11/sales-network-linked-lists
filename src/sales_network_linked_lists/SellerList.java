package sales_network_linked_lists;

public class SellerList {
	SellerNode head;
	
	void addSeller(Seller s) {
		SellerNode newNode = new SellerNode();
		newNode.value = s;
		
		//La lista est� vac�a
		
		if(head == null){
			head = newNode;
		}
		else { 
			//La lista no est� vac�a
			
			SellerNode last = head;
			while(last.next != null) {
				last = last.next;			
			}		
			last.next = newNode;
		}
	}
	
	
}
