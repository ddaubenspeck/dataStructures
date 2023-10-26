import java.util.*;
import java.io.*;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("data2.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}

		sf.close();
		// System.out.println(text[0]);
		String words[] = text[0].split(", ");
		// System.out.println(words[1]);
		Map<String, Integer> myMap = new HashMap<String, Integer>();

		// System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			if (myMap.containsKey(words[i])) {
				myMap.put(words[i], 1 + myMap.get(words[i]));
			} else {
				myMap.put(words[i], 1);
			}
		}
		
		System.out.printf("%-10s%15s\n", "Words", "Frequency"); //Heading
		Set ks = myMap.keySet( );
		Iterator iter = ks.iterator( );
		while(iter.hasNext( ))
		{
			String word = (String)iter.next( );
			Integer i = myMap.get(word);
			String asterisks = "";
		for(int k = 0; k<i; k++)
		{
			asterisks += "*";
		}
		System.out.printf("%-10s%15s\n", word, asterisks);

	}
	}
}
