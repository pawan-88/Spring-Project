package spring.staticfactory.own.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory_Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Factory_A a= (Factory_A)applicationContext.getBean("a");
		a.msg();

	}

}
