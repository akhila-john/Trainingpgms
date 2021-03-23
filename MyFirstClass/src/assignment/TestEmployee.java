package assignment;

public class TestEmployee {

public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"riya");
		Employee emp2 = new Employee(101,"riya");
		
		System.out.println("emp1 name "  +emp1.name +"id is " +emp1.id);
		System.out.println("emp2 name "  +emp2.name +"id is " +emp2.id);
		
		System.out.println("equality between emp1 and emp2 :" + emp1.equals(emp2));
		
		System.out.println("hashcode of emp1:" + emp1.hashCode());
		System.out.println("hashcode of emp2 :" + emp2.hashCode());
		}

   /* Set <Employee> employees = new HashSet<Employee>();
    employees.add(emp1);
    employees.add(emp2);
    System.out.println(employees);*/
}
