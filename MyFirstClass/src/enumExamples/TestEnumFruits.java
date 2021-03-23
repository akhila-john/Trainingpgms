package enumExamples;

 class TestEnumFruits {

	public static void main(String[] args) {
		
		//display prices
		System.out.println("fruits:"+APPLE.getPrice());
		
		//display all apples and prices
		System.out.println("all fruit prices..");
		for(Fruits fruits: Fruits.values() )
			System.out.println(fruits + "costs"+ fruits.getPrice() + "rupees");

	}

}
