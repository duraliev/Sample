public class Person {

	private String name;
	private int age;
	private double height;

	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("Created a new Person: " + toJSONString);
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public double getHeight(){
		return this.height;
	}

	public String toJSONString(){
		return "{\"name\":\"" + name + "\",\"age\":" + age + ",\"height\":" + height + "}";  
	}
}