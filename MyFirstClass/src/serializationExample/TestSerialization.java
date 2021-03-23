package serializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ObjectOutputStream objStream = new ObjectOutputStream (new FileOutputStream
				("C://Employee.txt")) ) {
			Employee obj1 = new Employee("riya", "teenu",45);
			System.out.println("before serializaion");
			System.out.println(obj1);
			objStream.writeObject(obj1);
		} catch (IOException e) {
			System.out.println("exception in serialization");
		}
		
		try (ObjectInputStream objStream1 = new ObjectInputStream (new FileInputStream
				("C://Employee.txt")) ) {
			Employee obj2 = (Employee) objStream1.readObject();
			System.out.println("after serializaion");
			System.out.println(obj2);
			//objStream.writeObject(obj1);
		} catch (IOException | ClassNotFoundException cnf) {
			System.out.println("exception in deserialization");
		}
		
	}

}
