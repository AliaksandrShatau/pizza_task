package epam.shatau.pizza.task;

/*
•	Dress (3)
•	Shirt (5)
•	Jeans (2)
•	Skirt (1)
•	Hat (2)
•	Jacket (2)
•	Coat (3)
•	Lingerie (5)
*/

public enum Equipment {
	Dress(3, "Dress"),
	Shirt(5, "Shirt"),
	Jeans(2, "Jeans"),
	Skirt(1, "Skirt"),
	Hat(2, "Hat"),
	Jacket(2, "Jacket"),
	Coat(3, "Coat"),
	Lingerie(5, "Lingerie");
	
	private int qty;
	private String nameEquipment;
	
	private Equipment(int qty, String nameEquipment) {
		this.qty = qty;
		this.nameEquipment = nameEquipment;
	}

	public double getQty() {
		return qty;
	}

	public String getNameEquipment() {
		return nameEquipment;
	}	
}