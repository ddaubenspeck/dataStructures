import java.util.*;

public class setUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>(); // Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");

		Set<String> s2 = new HashSet<String>(); // Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");

		// Build the union set, and store in s1
		s1.addAll(s2);
		// Print the union set
		Iterator iter1 = s1.iterator();
		while (iter1.hasNext()) {
			String name = (String) iter1.next();
			System.out.println(name);
		}
	}

}
