import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Javapracticetest {
//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count = 0;

		ArrayList<String> a = new ArrayList<String>();
		a.add("Alekya");
		a.add("Ankith");
		a.add("Harika");
		a.add("Amit");
		a.add("Hemanth");

		for (i = 0; i < a.size(); i++) {
			String name = a.get(i);
			if (name.startsWith("A"))
				count++;

		}

		System.out.println(count);

	}
@Test
public void streamFilter() {
	ArrayList<String> a = new ArrayList<String>();
	a.add("Alekya");
	a.add("Ankith");
	a.add("Harika");
	a.add("Amit");
	a.add("Hemanth");

	Long c = a.stream().filter(s -> s.startsWith("A")).count();
	System.out.println(c);

	Stream.of("Alekya", "Harika", "Amit", "ankitha", "Hemanth").filter(s -> s.startsWith("A"));
	}

}
