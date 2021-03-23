package enumExamples;

public class EnumConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficSignal[] signals = TrafficSignal.values();
		
		for (TrafficSignal signal : signals) {
			//java getter method example
			System.out.println("name : "+signal.name()+
					" Action :"+ signal.getAction());
		}
	}

}
