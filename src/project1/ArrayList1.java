package project1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		
	ArrayList Gogu = new ArrayList<>();
		
		Gogu.add(10);
		Gogu.add(40);
		Gogu.add(20);
		System.out.println(Gogu.contains(10));
	
        Collections.sort(Gogu);
        System.out.println(Gogu);
        
       
        
        
        for(int i=Gogu.size()-1; i>=0; i--) {
        	
        	System.out.println(Gogu.get(i));
        }
	}


}
