public class AnnotationDemo {

	@CoderZebron(name = "Iamasoldier6", host = "iamasoldier6.com", level = 1)
	public static void main(String[] args) {
		System.out.println("I am main method");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@CoderZebron(name = "Iamasoldier6", host = "iamasoldier6.com", level = 2)
	public void demo() {
		System.out.println("I am demo method");
	}
}
