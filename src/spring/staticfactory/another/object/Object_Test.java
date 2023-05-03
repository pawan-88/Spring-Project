package spring.staticfactory.another.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Object_Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		Print p = (Print)applicationContext.getBean("p");
		p.print();
	}

}
