package enumExamples;

public enum TrafficSignal {

	D("wait"), GREEN("Go"), ORANGE("slow down");
	
	private String action;
	
	TrafficSignal(String action) {
		System.out.println("inside condtructor class");
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}
}
