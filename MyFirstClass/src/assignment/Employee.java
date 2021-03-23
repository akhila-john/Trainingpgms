package assignment;

public class Employee {
	
	public String name;
	public int id;
	
	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
			Employee emp = (Employee) obj;
		return (emp.name== this.name && emp.id == this.id);
			}
	
	
	//@Override
	public int hashCode() {
		int result =31;
		return result;
	}

}
