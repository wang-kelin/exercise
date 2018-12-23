package exercise;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		first();
		Apple apple = second();
		System.out.println("编号:" + apple.getId() + "-类型:" + apple.getType() + "-售价:" + apple.getSale());
	}

	public static void first() {

		String args = "This is my first github repository";
		System.out.println(args);
	}
	
	public static Apple second(){
		
		Apple apple = new Apple();
		apple.setId(1);
		apple.setType("ss");
		apple.setSale("50");
		
		return apple;
	}
}
