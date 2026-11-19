package experiments;

public class exp24stringcompare {
	
	public static Boolean stringequal(String s1,String s2) {
		
		if(s1==null ||s2==null) {
			return false;
		}
		
		/*s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		return s1.equals(s2);
		*/
		
		return s1.equalsIgnoreCase(s2);
		
		
		
	}

}
