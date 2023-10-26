import java.io.*;
import java.util.*; //necessary for Scanner

public class codeTalker {
//hello world
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Input data file
		Scanner sf = new Scanner(new File("data.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();

		}
		sf.close();
		for (int i = 0; i < 13; i++) {
			System.out.println(text[i]);
		}
		// END input data file

		// Build Map
		Map<String, String> dict = new HashMap<String, String>();
		int numPairs = Integer.parseInt(text[0]);
		for (int j = 1; j <= numPairs; j++) {
			Scanner sc = new Scanner(text[j]);
			sc.useDelimiter("=");
			dict.put(sc.next(), sc.next());
		}
		// End Build Map
//meter always spank ketchup staple meter yellow beaver
		String sentc = text[maxIndx];
		String word[] = sentc.split(" ");
		for (int j = 0; j < word.length; j++) {
			if (dict.containsKey(word[j])) {
				System.out.print(dict.get(word[j]) + " ");
			} else {
				System.out.print(word[j] + " ");
			}
		}
		System.out.println("");

	}

}
