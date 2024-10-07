package calculator;

public class CalcTester {
	public static void main(String[] args) {
		Calculator newAvg = new Calculator();
		newAvg.calcAverage(20, 15.4);
		// calling sequence always is object.method(parameters, parameters)
		newAvg.calcAverage(1, 3, 4);
		
		// static void call, an object does not need to be created
		Calculator.voidAverage(3, 4);
		
		// recieves a value from the non-void method
		double avg = newAvg.calcAvg(2,3.5);
	}

}
