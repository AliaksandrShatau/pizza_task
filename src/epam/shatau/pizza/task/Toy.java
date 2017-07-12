package epam.shatau.pizza.task;

/*
 Барби - 3,
 Кенов - 2
*/

public enum Toy {
	Barbie(3, "Barbie"),
	Ken(2, "Ken");
	
	private int qty;
	private String toyName;
	
	private Toy(int qty, String toyName) {
		this.qty = qty;
		this.toyName = toyName;
	}

	public double getQty() {
		return qty;
	}

	public String getToyName() {
		return toyName;
	}
	
}
