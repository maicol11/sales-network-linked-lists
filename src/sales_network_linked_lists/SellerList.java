package sales_network_linked_lists;

public class SellerList {
	SellerNode root;
	
	void addSeller(Seller rootS, Seller right, Seller left) {
		SellerNode newNode 	= new SellerNode();
		newNode.right 		= right;
		newNode.left 		= left;
		
		
		if(root == null){
			root = newNode;
		}
		else {
			SellerNode last = root;
			while(last.root != null) {
				last = last.root;			
			}		
			last.root = newNode;
		}
	}
	
	void showAll() {
		SellerNode tmp = root;
		System.out.println("Los nombres de los venderons son:");
		while(tmp != null) {
			System.out.println("Left: " + tmp.left.name);
			System.out.println("Right: " + tmp.right.name);
			tmp = tmp.root;
		}
	}
}
