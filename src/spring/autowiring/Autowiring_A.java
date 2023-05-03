package spring.autowiring;

public class Autowiring_A {
	
	Autowiring_B autowiring_B;
	
	 Autowiring_A() {
		 System.out.println("A is created..");
	}
	 
	 public Autowiring_B getAutowiring_B() {
		 return autowiring_B;
	}
	 
	 public void setAutowiring_B(Autowiring_B autowiring_B) {
		 this.autowiring_B=autowiring_B;
	}
	 
	 void print() {
		 System.out.println("Hello Autowiring_A");
	 }
	 
	 void display() {
		 print();
		 autowiring_B.print();
	 }

}
