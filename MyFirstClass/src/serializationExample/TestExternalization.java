package serializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeNew emp = new EmployeeNew();
		emp.setEmployeeId(1234);
		emp.setEmployeeName("riya");
		emp.setDepartment("btech");
		emp.setNationality("Indian");
		
		//serialize the object
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"C:\\employeenew.txt");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//deserialize the object
		emp = null;
		try {
			FileInputStream fileIn = new FileInputStream(
					"C:\\employeenew.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (EmployeeNew) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("employeeclass not found");
			e.printStackTrace();
			return;
		}
		
		System.out.println("emp id: " + emp.getEmployeeId());
		System.out.println("emp name: " + emp.getEmployeeName());
		System.out.println("emp department : " + emp.getDepartment());
		System.out.println("emp nationality: " + emp.getNationality());
		
	}

}
