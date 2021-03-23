package assignment;

public class EqualsAndMethod {

	public static void main(String[] args) {
		
		String name1 = new String("myworld");
		String name2 = new String("myworld");
		
		//compares the reference not the actual contents
		System.out.println(name1==name2);
		
		//compares actual content of the object
		System.out.println(name1.equals(name2));
		
		System.out.println("********************");
		
		name1=name2 ;
		
        System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
	}

}
