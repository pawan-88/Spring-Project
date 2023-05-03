package spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring_Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Autowiring_A autowiring_A= applicationContext.getBean("autowiring_A",Autowiring_A.class);
		autowiring_A.display();
	}

}
