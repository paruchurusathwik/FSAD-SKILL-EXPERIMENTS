package DemoOnSpring.DemoOnSpringS7;

public class AutowiredXMLCarClass {
	//one class injected in another class
	AutowiredXMLEngineClass engine;
	//Generate Setter method
	public AutowiredXMLEngineClass getEngine() {
		return engine;
	}

	public void setEngine(AutowiredXMLEngineClass engine) {
		this.engine = engine;
	}
	void drive() {
		engine.start();
		System.out.println("Car is moving!");
	}

}
