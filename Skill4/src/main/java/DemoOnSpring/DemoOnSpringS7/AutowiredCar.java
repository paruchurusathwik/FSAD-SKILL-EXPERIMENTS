package DemoOnSpring.DemoOnSpringS7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //Spring creates the object(creating-bean for the class)
public class AutowiredCar {
	@Autowired  //Dependency(Injecting dependency class)
	AutowiredEngine engine;
	public void drive() {
		engine.start();
		System.out.println("Car is moving");
	}
	public void engineType(String type) {
		engine.engineType(type);
		System.out.println("Type of Engine is: " + engine.engineType);
	}

}
