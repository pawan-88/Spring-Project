package spring.staticfactory.own.object;

public class Factory_A {
	private static final Factory_A obj = new Factory_A();
	
	private Factory_A() {
		System.out.println("private contsructor..");
	}
	
	public static Factory_A getFactory_A() {
		System.out.println("Factory Method..");
		return obj;
	}
	
	public void  msg() {
		System.out.println("hello factory method...");
	}

}
