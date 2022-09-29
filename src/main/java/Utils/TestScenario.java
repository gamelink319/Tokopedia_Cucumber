package Utils;

public enum TestScenario {

	T1("TestBelanja");
	
	private String testName;
	
	TestScenario(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
