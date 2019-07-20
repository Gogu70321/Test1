package project1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> Gogu = new HashSet<String>();
		Gogu.add("India");
		Gogu.add("Bangla");

		
	 Iterator<String> Itr = Gogu.iterator();
	 
	 while(Itr.hasNext()) {
		 
		 System.out.println(Itr.next());
		 
	 }
	 
	 //2ndWay
	 
	 for(String val : Gogu) {
		 
		 System.out.println(val);
	 }
	}

}
