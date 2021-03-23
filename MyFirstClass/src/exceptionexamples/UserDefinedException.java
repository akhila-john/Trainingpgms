package exceptionexamples;

public class UserDefinedException {
	static void compute(int num) throws MyException {
		System.out.println("called computer[" + num + "]");
		if (num<10) {
			System.out.println("nmber lesthan 10");
		} else
			
				throw new MyException(num);
				
				
			}
	}

