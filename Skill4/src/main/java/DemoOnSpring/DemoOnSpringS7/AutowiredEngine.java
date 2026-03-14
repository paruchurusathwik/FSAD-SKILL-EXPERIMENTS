package DemoOnSpring.DemoOnSpringS7;

import org.springframework.stereotype.Component;

@Component   //Spring creates the object(creates-Bean)
public class AutowiredEngine {
	
	String engineType;
	public void start() {
		System.out.println("Engine Started");
	}
	public void engineType(String type) {
		this.engineType=type;
	}

}
