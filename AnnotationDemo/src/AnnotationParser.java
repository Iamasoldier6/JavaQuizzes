import java.lang.reflect.Method;

public class AnnotationParser {
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		String clazz = "AnnotationDemo";
		Method[] methods = AnnotationParser.class.getClassLoader().loadClass(clazz).getMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(CoderZebron.class)) {
				CoderZebron coder = method.getAnnotation(CoderZebron.class);
				System.out.println("method: " + method);
				System.out.println(
						"name= " + coder.name() + ", host= " + coder.host() + ", revision= " + coder.level());
			}
		}
	}
}
