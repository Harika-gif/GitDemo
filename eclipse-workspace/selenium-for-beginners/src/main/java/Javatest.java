import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Javatest {
	// @Test
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

	// @Test
	public void streamFilter() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Alekya");
		a.add("Ankith");
		a.add("Harika");
		a.add("Amit");
		a.add("Hemanth");

		Long c = a.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Alekya", "Harika", "Amit", "ankitha", "Hemanth").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();

		System.out.println(d);

		// print all names of array list with condition greater than 4 chars

		a.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		a.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	//@Test
	public void streamMap() 
	{ArrayList<String> names = new ArrayList<String>();
	names.add("man");
	names.add("Don");
	names.add("women");
	

		//printing the names of last char is a with upper case
		Stream.of("Abhijeet","Don","Alekhya","Adan","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		
		List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adan","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merge 2 different lists
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("adan"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollect()
	{
		List <String> ls=Stream.of("Abhijeet","Don","Alekhya","Adan","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
	
		
		List<Integer> values=Arrays.asList(3,2,8,2,3,2,0,6,4);
		values.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
