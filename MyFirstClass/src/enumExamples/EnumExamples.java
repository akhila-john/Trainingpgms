package enumExamples;

enum Day_new{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	
}
public class EnumExamples {

	public static void main(String[] args) {
		Day_new day = Day_new.THURSDAY;
		
		switch(day) {
		case SUNDAY:
			System.out.println("sunday");
		    break;
		case MONDAY:
			System.out.println("monday");
		    break;
		case TUESDAY:
			System.out.println("tuesady");
		    break;
		case WEDNESDAY:
			System.out.println("wednesday");
		    break;
		case THURSDAY:
			System.out.println("thursday");
		    break;
		case FRIDAY:
			System.out.println("friday");
		    break;
		case SATURDAY:
			System.out.println("saturday");
		    break;
		}

	}

}
