package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
@ComponentScan(basePackages = "DemoOnSpring.DemoOnSpringS7")
class AppConfig {
	//AppConfig class is used for configuration
}
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AutowiredCar car = context.getBean(AutowiredCar.class);
		car.drive();
		car.engineType("Petrol");
	}

}
