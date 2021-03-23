package firstclass;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Alphabet");
		System.out.println("First hashcode"+sb1.hashCode());
		System.out.println("String length is" +sb.length());
		System.out.println("String Capacity is"+sb.capacity());
		System.out.println("String length is"+sb1.length());
        System.out.println("String capacity is"+sb1.capacity());
        System.out.println(sb1.append("Worldddddddddddddd"));
        System.out.println("After changing the hashcode"+sb1.hashCode());
        System.out.println(sb1.capacity());
        System.out.println(sb1);
        System.out.println(sb1.reverse());
        System.out.println("///////////////////");
        
        StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder("helloo");
		System.out.println("String length is" +sb2.length());
		System.out.println("String Capacity is"+sb2.capacity());
		
		System.out.println("String length is" +sb3.length());
		System.out.println("String Capacity is"+sb3.capacity());
	   }
	}

