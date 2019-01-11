package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		first();
		two();
		Map<Integer,List<Apple>> apple = second();
		for(List<Apple> appleList : apple.values()){
			System.out.println("苹果:" + appleList.get(0).getId() + ", " + appleList.get(0).getType()
					+ ", " + appleList.get(0).getSale());
		}
	}

	private static void first() {

		String args = "This is my first github repository";
		System.out.println(args);
	}

	private static void two() {

		String args = "2019-1-11 This is my second go to github";
		System.out.println(args);
	}

	private static Map<Integer,List<Apple>> second(){
		
		List<Apple> appleList = new ArrayList<>();
		
		Apple apple1 = new Apple();
		apple1.setId(1);
		apple1.setType("ss");
		apple1.setSale("50");
		
		Apple apple2 = new Apple();
		apple2.setId(2);
		apple2.setType("ww");
		apple2.setSale("60");
		
		Apple apple3 = new Apple();
		apple3.setId(3);
		apple3.setType("ll");
		apple3.setSale("70");
		
		appleList.add(apple1);
		appleList.add(apple2);
		appleList.add(apple3);
		
		Map<Integer,List<Apple>> appleMap = appleList.stream().collect(Collectors.groupingBy(Apple :: getId));
		
		return appleMap;
	}
}
