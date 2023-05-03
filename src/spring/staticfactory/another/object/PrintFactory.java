package spring.staticfactory.another.object;

public class PrintFactory {
	
	public static Print getPrint() {
		
		//we can write any one instance either A Or B
		return new Object_A();
//		return new Object_B();
	}

}
