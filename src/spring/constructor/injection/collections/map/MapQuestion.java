package spring.constructor.injection.collections.map;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;  

public class MapQuestion {
	
	private int id;
	private String name;
	private Map<String,String> answer;
	
	public MapQuestion() {}
	
	public MapQuestion(int id, String name, Map<String,String>answer) {
		super();
		this.id=id;
		this.name=name;
		this.answer=answer;
	}
	
	public void displayInfo() {
		System.out.println("Question id:"+id);
		System.out.println("Question name:"+name);
		System.out.println("Answer..");
		Set<java.util.Map.Entry<String, String>> set= answer.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = set.iterator();
		while(itr.hasNext()) {
			java.util.Map.Entry<String, String> entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+"PostedBy:"+entry.getValue());
		}
		
	}
	
	

}
