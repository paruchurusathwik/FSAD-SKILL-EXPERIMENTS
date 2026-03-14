package DemoOnSpring.DemoOnSpringS7;

public class Car {
	Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void showDetails() {
		System.out.println("Engine Type is: " + engine.getType());
	}

}
