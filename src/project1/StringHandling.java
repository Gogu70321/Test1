package project1;

public class StringHandling {

	
	public static void main(String[] args) {
		
		boolean match = false;
		/*
		String first = "AutomationTraining Kony";
			    String y [] = first.split("i");
			    
			for(int i = 0; i<y.length; i++) {
				System.out.println(y[i].length());
				
			}
			*/	
		
			
			String s = "Madryfyram";
	
			
			for(int i=0; i<s.length(); i++)
			{
				
				if(s.charAt(i)==s.charAt(s.length()-(i+1))){
				
					match = true;
					
				}
				
			
			}if(match=true) {
				
				System.out.println("String is Palindrum");
			}else {
				
				System.out.println("String is not Palindrum");
			}
			
			
			
			/*tring t = "malayalam";
			
			StringBuffer sb = new StringBuffer(t);
			String u = sb.reverse().toString();
			
			if(t.equals(u)) {
				
				System.out.println("String is palindrum");
			}else {
				
				System.out.println("String is not palindrum");
			}*/
			
			
			
			
			StringBuffer y = new StringBuffer("Gogu");
			String g = y.reverse().toString();
			System.out.println(g);
			
	}
}
