package enumExamples;

public enum Fruits {

	APPLE(4),BANANA(9), GRAPES(12), AVOCADO(25), CHERRY(32);
	
	private int price;
	
	private Fruits(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
