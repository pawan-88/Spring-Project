package spring.constructor.injection.collections;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String name;
	private List<String> answer;
	
	public Question() {
		
	}
	public Question(int id, String name, List<String> answer) {
		this.id=id;
		this.name=name;
		this.answer=answer;
	}
	
	public void displayInfo() {
		System.out.println(id+"");
		System.out.println(name+"");
		System.out.println("answer are:");
		Iterator<String> itr = answer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
	

}
