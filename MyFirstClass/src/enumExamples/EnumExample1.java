package enumExamples;

 class EnumExample1 {
	 //enumerator declared inside the class
	 
	 public enum Season{
		 WINTER, SPRING, SUMMER, FALL
	 }

	public static void main(String[] args) {
		for (Season s : Season.values())
			System.out.println(s);

	}

}
