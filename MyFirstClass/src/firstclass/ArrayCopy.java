package firstclass;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] copyFrom = {'d','e','c','f','t','b','y','z','x','l'};
		char [] copyTo = new char[7];
		
		/*char[] copyFrom = {'d','e','c','f','t','b','y','z','x','l'};
		char [] copyTo = new char[25];*/
		copyFrom = System.arraycopy (copyFrom, copyFrom.length + 1);
		
		System.arraycopy(copyFrom, 4, copyTo, 0, 5); //4 is from where it shld start
		                                             //5 is total no of characters to be moved
		/*for (int inc=0;inc<copyTo.length; inc++) {   //0 is the destination
			System.out.print(copyTo[inc]);*/
		for (int)
		}
		// TODO Auto-generated method stub

	}

}
